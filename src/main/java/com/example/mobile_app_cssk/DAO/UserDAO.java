package com.example.mobile_app_cssk.DAO;

import com.example.mobile_app_cssk.models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

public class UserDAO extends DAO{
    private final String QUERY_GET_ALL_USERS = "SELECT * FROM e_hospital.user";
    private final String QUERY_GET_USER_BY_ID = "SELECT * FROM e_hospital.user WHERE ID = ?";
    private final String QUERY_GET_ALL_USERNAMES_BY_USERNAME =
            "SELECT user.username FROM e_hospital.user WHERE username = ?";
    private final String QUERY_CHECK_LOGIN =
            "SELECT user.username, user.password FROM e_hospital.user";

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        try {
            Connection connection = this.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(QUERY_GET_ALL_USERS);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("iduser");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                String fullname = resultSet.getString("fullname");
                int age = resultSet.getInt("age");
                Date dateOfBirth = resultSet.getDate("date_of_birth");
                int sex = resultSet.getInt("sex");
                String contact = resultSet.getString("contact");
                users.add(new User(id, username, password, fullname, age, sex, dateOfBirth, contact));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    public User getUser(int id) {
        User user = null;
        try {
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(QUERY_GET_USER_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            user = new User();
            while (resultSet.next()) {
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                String fullname = resultSet.getString("fullname");
                int age = resultSet.getInt("age");
                Date dateOfBirth = resultSet.getDate("date_of_birth");
                int sex = resultSet.getInt("sex");
                String contact = resultSet.getString("contact");
                user.setUsername(username);
                user.setPassword(password);
                user.setFullName(fullname);
                user.setAge(age);
                user.setDateOfBirth(dateOfBirth);
                user.setSex(sex);
                user.setContact(contact);
                user.setId(id);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    public boolean isValidUsername(String username) {
        boolean result = false;
        try {
            Connection connection = this.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(QUERY_GET_ALL_USERNAMES_BY_USERNAME);
            ResultSet resultSet = preparedStatement.executeQuery();
            String usernameFind = null;
            while (resultSet.next()) {
                usernameFind = resultSet.getString("username");
            }
            if (usernameFind != username) {
                result = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }


    public boolean isValidLogin(String username, String password) {
        boolean result = false;
        try {
            Connection connection = this.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(QUERY_CHECK_LOGIN);
            ResultSet resultSet = preparedStatement.executeQuery();
            String usernameFind = null;
            String passwordFind = null;
            while (resultSet.next()) {
                usernameFind = resultSet.getString("username");
            }
            if (usernameFind != username) {
                result = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}

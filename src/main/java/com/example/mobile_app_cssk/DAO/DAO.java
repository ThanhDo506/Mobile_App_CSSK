package com.example.mobile_app_cssk.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
    private final String jdbcURL = "jdbc:mysql://localhost:3306/e_hospital";
    private final String jdbcUsername = "root";
    private final String jdbcPassword = "!Thanhdo0506";

    public DAO() {
    }

    protected Connection getConnection() {
        Connection connection = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return connection;
    }
}

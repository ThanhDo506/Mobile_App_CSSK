package com.example.mobile_app_cssk.models;

import java.sql.Date;

public class User {
    private int id;
    private String fullName;
    private String username;
    private String password;
    private int sex;
    private Date dateOfBirth;
    private String contact;

    private int age;

    public User() {

    }

    public User(int id, String fullName, String username, String password, int age, int sex, Date dateOfBirth,
                String contact) {
        this.id = id;
        this.fullName = fullName;
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

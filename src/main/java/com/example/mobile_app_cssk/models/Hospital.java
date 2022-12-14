package com.example.mobile_app_cssk.models;

import java.util.ArrayList;

public class Hospital {
    private int id;
    private String name;
    private String address;
    private String description;

    private ArrayList<Department> departments;

    public Hospital(int id, String name, String address, String description) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.description = description;
        this.departments = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public void addDepartments(Department department) {
        this.departments.add(department);
    }
}

package com.example.mobile_app_cssk.models;

import java.util.ArrayList;

public class Department {
    private int id;
    private String name;
    private String address;
    private ArrayList<Doctor> doctors;

    public Department(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.doctors = new ArrayList<>();
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

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void addDoctors(Doctor doctor) {
        this.doctors.add(doctor);
    }
}

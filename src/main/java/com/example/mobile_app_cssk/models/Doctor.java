package com.example.mobile_app_cssk.models;

import java.sql.Date;
import java.util.ArrayList;

public class Doctor extends User {
    private String diploma;
    private String description;

    private String department;

    private String hospital;

    private ArrayList<Examine> examines = null;

    public Doctor() {
        super();
    }

    public Doctor(int id, String fullName, String username, String password,int age, int sex, Date dateOfBirth,
                  String contact, String diploma, String description, String department, String hospital) {
        super(id, fullName, username, password, age, sex, dateOfBirth, contact);
        this.diploma = diploma;
        this.description = description;
        this.department = department;
        this.hospital = hospital;
        examines = new ArrayList<>();
    }

    public String getDiploma() {
        return diploma;
    }

    public void setDiploma(String diploma) {
        this.diploma = diploma;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public ArrayList<Examine> getExamines() {
        return examines;
    }

    public void addExamine(Examine examine) {
        this.examines.add(examine);
    }
}

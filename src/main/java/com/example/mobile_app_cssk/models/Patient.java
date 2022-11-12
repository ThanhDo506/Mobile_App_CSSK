package com.example.mobile_app_cssk.models;

import java.sql.Date;
import java.util.ArrayList;

public class Patient extends User{
    private String bloodType;

    // * Tình trạng bệnh lí;
    private String pathologicalCondition;

    private ArrayList<Examine> examines = null;

    public Patient() {

    }

    public Patient(int id, String fullName, String username, String password, int age, int sex,
                   Date dateOfBirth, String contact, String bloodType, String pathologicalCondition) {
        super(id, fullName, username, password, age, sex, dateOfBirth, contact);
        this.bloodType = bloodType;
        this.pathologicalCondition = pathologicalCondition;
        examines = new ArrayList<>();
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getPathologicalCondition() {
        return pathologicalCondition;
    }

    public void setPathologicalCondition(String pathologicalCondition) {
        this.pathologicalCondition = pathologicalCondition;
    }

    public ArrayList<Examine> getExamines() {
        return examines;
    }

    public void addExamine(Examine examine) {
        this.examines.add(examine);
    }
}

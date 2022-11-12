package com.example.mobile_app_cssk.models;

import java.util.ArrayList;
import java.util.Date;

public class Examine {
    private int id;
    private int idPatient;
    private int idDoctor;
    private Date timeStart;
    private Date timeEnd;
    private String status;
    private String diseases;
    private String conclude;
    private ArrayList<Medical> medicals;
    private ArrayList<Test> tests;

    public Examine() {
    }

    public Examine(int id, int idPatient, int idDoctor, Date timeStart, Date timeEnd, String status, String diseases, String conclude) {
        this.id = id;
        this.idPatient = idPatient;
        this.idDoctor = idDoctor;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.status = status;
        this.diseases = diseases;
        this.conclude = conclude;
        this.medicals = new ArrayList<Medical>();
        this.tests = new ArrayList<Test>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
    }

    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    public Date getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Date timeStart) {
        this.timeStart = timeStart;
    }

    public Date getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(Date timeEnd) {
        this.timeEnd = timeEnd;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDiseases() {
        return diseases;
    }

    public void setDiseases(String diseases) {
        this.diseases = diseases;
    }

    public String getConclude() {
        return conclude;
    }

    public void setConclude(String conclude) {
        this.conclude = conclude;
    }

    public ArrayList<Medical> getMedicals() {
        return medicals;
    }

    public void addMedicals(Medical medical) {
       this.medicals.add(medical);
    }

    public ArrayList<Test> getTests() {
        return tests;
    }

    public void addTests(Test test) {
        this.tests.add(test);
    }
}

package com.example.mobile_app_cssk.models;

public class Medical {
    private String name;
    // * Liều lượng
    private String dosing;
    // * Số lượng
    private int amount;

    public Medical() {
    }

    public Medical(String name, String dosing, int amount) {
        this.name = name;
        this.dosing = dosing;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDosing() {
        return dosing;
    }

    public void setDosing(String dosing) {
        this.dosing = dosing;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

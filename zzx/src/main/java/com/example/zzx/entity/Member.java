package com.example.zzx.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int phone;
    private String fitnessPlan;
    private int status;// 0-normal; 1-frozen; 3-overdue

    public Member() {
    }

    public Member(int id, String name, int phone, String fitnessPlan, int status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.fitnessPlan = fitnessPlan;
        
        this.status = status;
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

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getFitnessPlan() {
        return fitnessPlan;
    }

    public void setFitnessPlan(String fitnessPlan) {
        this.fitnessPlan = fitnessPlan;
    }


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}

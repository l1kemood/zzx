package com.example.zzx.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Time;

@Entity
public class MemberInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String fitnessPlan;
    private Time creationTime;
    private int periodOfValidity;
    private String opportunity;
    private int status;// 0-normal; 1-frozen; 3-overdue

    public MemberInfo(){
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

    public String getFitnessPlan() {
        return fitnessPlan;
    }

    public void setFitnessPlan(String fitnessPlan) {
        this.fitnessPlan = fitnessPlan;
    }

    public Time getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Time creationTime) {
        this.creationTime = creationTime;
    }

    public int getPeriodOfValidity() {
        return periodOfValidity;
    }

    public void setPeriodOfValidity(int periodOfValidity) {
        this.periodOfValidity = periodOfValidity;
    }

    public String getOpportunity() {
        return opportunity;
    }

    public void setOpportunity(String opportunity) {
        this.opportunity = opportunity;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public MemberInfo(int id, String name, String fitnessPlan, Time creationTime, int periodOfValidity, String opportunity, int status) {
        this.id = id;
        this.name = name;
        this.fitnessPlan = fitnessPlan;
        this.creationTime = creationTime;
        this.periodOfValidity = periodOfValidity;
        this.opportunity = opportunity;
        this.status = status;
    }



}

package com.example.zzx.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FitnessPlanType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String FPName;

    public FitnessPlanType() {

    }
    public FitnessPlanType(int id, String name) {
        this.id = id;
        this.FPName = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return FPName;
    }

    public void setName(String name) {
        this.FPName = name;
    }
    


}

package com.example.m2mvcTest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SmartPhone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private String model;
    private Integer Ram;


    public SmartPhone() {
    }

    public SmartPhone(Long id, String model, Integer ram) {
        this.id = id;
        this.model = model;
        Ram = ram;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getRam() {
        return Ram;
    }

    public void setRam(Integer ram) {
        Ram = ram;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", Ram=" + Ram +
                '}';
    }
}

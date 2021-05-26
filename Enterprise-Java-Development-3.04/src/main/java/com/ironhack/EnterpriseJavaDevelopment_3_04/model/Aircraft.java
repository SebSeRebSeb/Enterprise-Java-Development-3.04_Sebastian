package com.ironhack.EnterpriseJavaDevelopment_3_04.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="aircraft")
public class Aircraft {
    @Id
    @Column(name="model")
    private String model;
    @Column(name="seats")
    private int seats;

    public Aircraft() {
    }

    public Aircraft(String model, int seats) {
        this.model = model;
        this.seats = seats;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}

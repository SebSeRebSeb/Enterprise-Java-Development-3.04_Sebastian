package com.ironhack.EnterpriseJavaDevelopment_3_04.model;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;

    @Column(columnDefinition = "ENUM('None', 'Silver', 'Gold')")
    @Enumerated(EnumType.STRING)
    private Status status;
    @Column(name = "mileage")
    private int mileage;

    //Constructor
    public Customer(){

    }

    public Customer(String name, com.ironhack.EnterpriseJavaDevelopment_3_04.model.Status status, int mileage) {
        this.name = name;
        status = status;
        this.mileage = mileage;
    }


    //Getter and Setter

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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}


package com.examly.springapp.model;

import jakarta.persistence.*;
@Entity
@Table(name = "membership_types")
public class MembershipType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long typeId;

    private String typeName;
    private double price;
    private int durationInMonths;

    // Default constructor
    public MembershipType() {}

    // Parameterized constructor
    public MembershipType(String typeName, double price, int durationInMonths) {
        this.typeName = typeName;
        this.price = price;
        this.durationInMonths = durationInMonths;
    }

    // Getters and Setters
    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDurationInMonths() {
        return durationInMonths;
    }

    public void setDurationInMonths(int durationInMonths) {
        this.durationInMonths = durationInMonths;
    }
}
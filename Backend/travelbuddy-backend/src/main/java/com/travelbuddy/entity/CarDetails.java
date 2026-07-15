package com.travelbuddy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CarDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String carNumber;
    private String company;
    private String model;
    private String color;
    private int yearOfPurchase;

    public CarDetails() {
    }

    public CarDetails(int id, String carNumber, String company,
                      String model, String color, int yearOfPurchase) {
        this.id = id;
        this.carNumber = carNumber;
        this.company = company;
        this.model = model;
        this.color = color;
        this.yearOfPurchase = yearOfPurchase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearOfPurchase() {
        return yearOfPurchase;
    }

    public void setYearOfPurchase(int yearOfPurchase) {
        this.yearOfPurchase = yearOfPurchase;
    }

    @Override
    public String toString() {
        return "CarDetails{" +
                "id=" + id +
                ", carNumber='" + carNumber + '\'' +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", yearOfPurchase=" + yearOfPurchase +
                '}';
    }
}
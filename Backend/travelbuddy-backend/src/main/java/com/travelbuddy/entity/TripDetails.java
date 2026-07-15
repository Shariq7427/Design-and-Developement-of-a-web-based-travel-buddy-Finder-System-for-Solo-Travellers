package com.travelbuddy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TripDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String oTravelerName;
    private String tTravelerName;
    private String tourGuideName;
    private String volunteerName;
    private String carNumber;
    private String driverName;

    public TripDetails() {
    }

    public TripDetails(int id,
                       String oTravelerName,
                       String tTravelerName,
                       String tourGuideName,
                       String volunteerName,
                       String carNumber,
                       String driverName) {

        this.id = id;
        this.oTravelerName = oTravelerName;
        this.tTravelerName = tTravelerName;
        this.tourGuideName = tourGuideName;
        this.volunteerName = volunteerName;
        this.carNumber = carNumber;
        this.driverName = driverName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOTravelerName() {
        return oTravelerName;
    }

    public void setOTravelerName(String oTravelerName) {
        this.oTravelerName = oTravelerName;
    }

    public String getTTravelerName() {
        return tTravelerName;
    }

    public void setTTravelerName(String tTravelerName) {
        this.tTravelerName = tTravelerName;
    }

    public String getTourGuideName() {
        return tourGuideName;
    }

    public void setTourGuideName(String tourGuideName) {
        this.tourGuideName = tourGuideName;
    }

    public String getVolunteerName() {
        return volunteerName;
    }

    public void setVolunteerName(String volunteerName) {
        this.volunteerName = volunteerName;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public String toString() {
        return "TripDetails{" +
                "id=" + id +
                ", oTravelerName='" + oTravelerName + '\'' +
                ", tTravelerName='" + tTravelerName + '\'' +
                ", tourGuideName='" + tourGuideName + '\'' +
                ", volunteerName='" + volunteerName + '\'' +
                ", carNumber='" + carNumber + '\'' +
                ", driverName='" + driverName + '\'' +
                '}';
    }
}
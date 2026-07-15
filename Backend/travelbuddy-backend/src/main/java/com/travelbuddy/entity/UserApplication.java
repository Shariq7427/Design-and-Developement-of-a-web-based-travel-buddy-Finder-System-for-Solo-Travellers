package com.travelbuddy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int age;
    private String gender;
    private long phoneNumber;
    private String emailId;
    private String address;
    private String placeOfVisit;

    public UserApplication() {
    }

    public UserApplication(int id, String name, int age, String gender,
                           long phoneNumber, String emailId,
                           String address, String placeOfVisit) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        this.address = address;
        this.placeOfVisit = placeOfVisit;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPlaceOfVisit() {
        return placeOfVisit;
    }

    public void setPlaceOfVisit(String placeOfVisit) {
        this.placeOfVisit = placeOfVisit;
    }

    @Override
    public String toString() {
        return "UserApplication{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", emailId='" + emailId + '\'' +
                ", address='" + address + '\'' +
                ", placeOfVisit='" + placeOfVisit + '\'' +
                '}';
    }
}
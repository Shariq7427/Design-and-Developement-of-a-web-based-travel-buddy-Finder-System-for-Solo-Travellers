package com.travelbuddy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String requestFrom;
    private String requestTo;

    public UserRequest() {
    }

    public UserRequest(int id, String requestFrom, String requestTo) {
        this.id = id;
        this.requestFrom = requestFrom;
        this.requestTo = requestTo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRequestFrom() {
        return requestFrom;
    }

    public void setRequestFrom(String requestFrom) {
        this.requestFrom = requestFrom;
    }

    public String getRequestTo() {
        return requestTo;
    }

    public void setRequestTo(String requestTo) {
        this.requestTo = requestTo;
    }

    @Override
    public String toString() {
        return "UserRequest{" +
                "id=" + id +
                ", requestFrom='" + requestFrom + '\'' +
                ", requestTo='" + requestTo + '\'' +
                '}';
    }
}
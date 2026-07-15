package com.travelbuddy.service;

import org.springframework.stereotype.Service;

import com.travelbuddy.entity.CarDetails;
import com.travelbuddy.repository.CarDetailsRepository;

@Service
public class CarDetailsService {

    private final CarDetailsRepository cdRepo;

    public CarDetailsService(CarDetailsRepository cdRepo) {
        this.cdRepo = cdRepo;
    }

    public String randomCar() {

        CarDetails carDetails = cdRepo.findRandomCarNumber();

        if (carDetails == null) {
            return "";
        }

        return carDetails.getCarNumber();
    }
}
package com.travelbuddy.service;

import org.springframework.stereotype.Service;

import com.travelbuddy.entity.DriverDetails;
import com.travelbuddy.repository.DriverDetailsRepository;

@Service
public class DriverDetailsService {

    private final DriverDetailsRepository ddRepo;

    public DriverDetailsService(DriverDetailsRepository ddRepo) {
        this.ddRepo = ddRepo;
    }

    public String randomDriver() {

        DriverDetails driverDetails = ddRepo.findRandomDriverName();

        if (driverDetails == null) {
            return "";
        }

        return driverDetails.getDriverName();
    }
}
package com.travelbuddy.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.travelbuddy.entity.DriverDetails;
import com.travelbuddy.repository.DriverDetailsRepository;
import com.travelbuddy.service.DriverDetailsService;

@RestController
@CrossOrigin(origins = "*")
public class DriverDetailsController {

    private final DriverDetailsRepository driverRepo;
    private final DriverDetailsService driverService;

    public DriverDetailsController(DriverDetailsRepository driverRepo,
                                   DriverDetailsService driverService) {
        this.driverRepo = driverRepo;
        this.driverService = driverService;
    }

    @PostMapping("/drivers")
    public DriverDetails driverAdd(@RequestBody DriverDetails driverDetails) {
        return driverRepo.save(driverDetails);
    }

    @GetMapping("/randomDriver")
    public String driverRandom() {
        return driverService.randomDriver();
    }
}
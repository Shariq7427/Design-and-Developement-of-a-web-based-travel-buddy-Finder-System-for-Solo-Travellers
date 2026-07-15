package com.travelbuddy.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.travelbuddy.entity.CarDetails;
import com.travelbuddy.repository.CarDetailsRepository;
import com.travelbuddy.service.CarDetailsService;

@RestController
@CrossOrigin(origins = "*")
public class CarDetailsController {

    private final CarDetailsRepository cdRepo;
    private final CarDetailsService cdService;

    public CarDetailsController(CarDetailsRepository cdRepo,
                                CarDetailsService cdService) {
        this.cdRepo = cdRepo;
        this.cdService = cdService;
    }

    @PostMapping("/cars")
    public CarDetails carAdd(@RequestBody CarDetails carDetails) {
        return cdRepo.save(carDetails);
    }

    @GetMapping("/randomCar")
    public String carRandom() {
        return cdService.randomCar();
    }
}
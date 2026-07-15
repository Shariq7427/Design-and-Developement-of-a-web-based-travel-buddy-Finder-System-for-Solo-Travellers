package com.travelbuddy.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.travelbuddy.entity.TripDetails;
import com.travelbuddy.repository.TripDetailsRepository;
import com.travelbuddy.service.TripDetailsService;

@RestController
@CrossOrigin(origins = "*")
public class TripDetailsController {

    private final TripDetailsRepository tripRepo;
    private final TripDetailsService tripService;

    public TripDetailsController(
            TripDetailsRepository tripRepo,
            TripDetailsService tripService) {

        this.tripRepo = tripRepo;
        this.tripService = tripService;
    }

    @PostMapping("/tripdetails")
    public TripDetails addTrip(@RequestBody TripDetails tripDetails) {
        return tripRepo.save(tripDetails);
    }

    @GetMapping("/tripdetails")
    public List<TripDetails> getAllTrips() {
        return tripRepo.findAll();
    }

    @GetMapping("/tripCheck")
    public String checkTrip(@RequestParam String username) {
        return tripService.checkTrip(username);
    }

    @DeleteMapping("/deletetrip")
    public void deleteTrip(@RequestParam String username) {
        tripRepo.deleteByOTravelerName(username);
    }
}
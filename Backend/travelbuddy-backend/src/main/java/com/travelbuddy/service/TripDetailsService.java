package com.travelbuddy.service;

import org.springframework.stereotype.Service;

import com.travelbuddy.entity.TripDetails;
import com.travelbuddy.repository.TripDetailsRepository;

@Service
public class TripDetailsService {

    private final TripDetailsRepository tripRepo;

    public TripDetailsService(TripDetailsRepository tripRepo) {
        this.tripRepo = tripRepo;
    }

    public String checkTrip(String username) {

        if (username == null || username.isBlank()) {
            return "user has not joined any trip";
        }

        TripDetails ownerTrip = tripRepo.findByOTravelerName(username);

        if (ownerTrip != null) {
            return "exists";
        }

        TripDetails travelerTrip = tripRepo.findByTTravelerName(username);

        if (travelerTrip != null) {
            return "exists";
        }

        return "user has not joined any trip";
    }

}
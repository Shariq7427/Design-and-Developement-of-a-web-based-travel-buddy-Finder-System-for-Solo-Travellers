package com.travelbuddy.service;

import org.springframework.stereotype.Service;

import com.travelbuddy.entity.TourGuideDetails;
import com.travelbuddy.repository.TourGuideDetailsRepository;

@Service
public class TourGuideDetailsService {

    private final TourGuideDetailsRepository tdRepo;

    public TourGuideDetailsService(TourGuideDetailsRepository tdRepo) {
        this.tdRepo = tdRepo;
    }

    public String randomTourGuide() {

        TourGuideDetails guide = tdRepo.findRandomTourGuide();

        if (guide == null) {
            return "";
        }

        return guide.getTourGuideName();
    }
}
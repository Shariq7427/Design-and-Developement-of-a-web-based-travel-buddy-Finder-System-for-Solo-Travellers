package com.travelbuddy.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.travelbuddy.entity.TourGuideDetails;
import com.travelbuddy.repository.TourGuideDetailsRepository;
import com.travelbuddy.service.TourGuideDetailsService;

@RestController
@CrossOrigin(origins = "*")
public class TourGuideDetailsController {

    private final TourGuideDetailsRepository tdRepo;
    private final TourGuideDetailsService tdService;

    public TourGuideDetailsController(TourGuideDetailsRepository tdRepo,
                                      TourGuideDetailsService tdService) {
        this.tdRepo = tdRepo;
        this.tdService = tdService;
    }

    @PostMapping("/tourGuides")
    public TourGuideDetails tourGuideAdd(@RequestBody TourGuideDetails tourGuideDetails) {
        return tdRepo.save(tourGuideDetails);
    }

    @GetMapping("/randomTourGuide")
    public String tourGuideRandom() {
        return tdService.randomTourGuide();
    }
}
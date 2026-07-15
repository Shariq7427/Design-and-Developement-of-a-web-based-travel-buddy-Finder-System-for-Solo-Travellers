package com.travelbuddy.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.travelbuddy.entity.VolunteerApplication;
import com.travelbuddy.repository.VolunteerApplicationRepository;
import com.travelbuddy.service.VolunteerApplicationService;

@RestController
@CrossOrigin(origins = "*")
public class VolunteerApplicationController {

    private final VolunteerApplicationRepository volunteerRepo;
    private final VolunteerApplicationService volunteerService;

    public VolunteerApplicationController(
            VolunteerApplicationRepository volunteerRepo,
            VolunteerApplicationService volunteerService) {
        this.volunteerRepo = volunteerRepo;
        this.volunteerService = volunteerService;
    }

    @PostMapping("/volunteers")
    public VolunteerApplication volunteerAdd(
            @RequestBody VolunteerApplication volunteerApplication) {
        return volunteerRepo.save(volunteerApplication);
    }

    @GetMapping("/randomVolunteer")
    public String volunteerRandom() {
        return volunteerService.randomVolunteer();
    }
}
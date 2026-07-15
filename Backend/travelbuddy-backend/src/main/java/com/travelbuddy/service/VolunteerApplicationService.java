package com.travelbuddy.service;

import org.springframework.stereotype.Service;

import com.travelbuddy.entity.VolunteerApplication;
import com.travelbuddy.repository.VolunteerApplicationRepository;

@Service
public class VolunteerApplicationService {

    private final VolunteerApplicationRepository vaRepo;

    public VolunteerApplicationService(VolunteerApplicationRepository vaRepo) {
        this.vaRepo = vaRepo;
    }

    public String randomVolunteer() {

        VolunteerApplication volunteer = vaRepo.findRandomVolunteer();

        if (volunteer == null) {
            return "";
        }

        return volunteer.getName();
    }
}
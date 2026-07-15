package com.travelbuddy.service;

import org.springframework.stereotype.Service;

import com.travelbuddy.entity.UserApplication;
import com.travelbuddy.repository.UserApplicationRepository;

@Service
public class UserApplicationService {

    private final UserApplicationRepository uaRepo;

    public UserApplicationService(UserApplicationRepository uaRepo) {
        this.uaRepo = uaRepo;
    }

    public String checkApplication(String username) {

        if (username == null) {
            return "fail";
        }

        UserApplication application = uaRepo.findByName(username);

        if (application != null &&
            application.getName().contentEquals(username)) {

            return "success";
        }

        return "fail";
    }
}
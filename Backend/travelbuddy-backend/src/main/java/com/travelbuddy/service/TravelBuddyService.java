package com.travelbuddy.service;

import org.springframework.stereotype.Service;

import com.travelbuddy.entity.TravelBuddy;
import com.travelbuddy.repository.TravelBuddyRepository;

@Service
public class TravelBuddyService {

    private final TravelBuddyRepository tbRepo;

    public TravelBuddyService(TravelBuddyRepository tbRepo) {
        this.tbRepo = tbRepo;
    }

    public String checkLogin(String username, String password) {

        TravelBuddy buddy = tbRepo.findByUserName(username);

        if (buddy != null &&
            buddy.getPassword().contentEquals(password)) {

            return "success";
        }

        return "fail";
    }

    public String checkUser(String username) {

        if (username == null) {
            return "not exists";
        }

        TravelBuddy buddy = tbRepo.findByUserName(username);

        if (buddy != null &&
            buddy.getUserName().contentEquals(username)) {

            return "exists";
        }

        return "not exists";
    }
}
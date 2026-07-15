package com.travelbuddy.service;

import org.springframework.stereotype.Service;

import com.travelbuddy.entity.AdminDetails;
import com.travelbuddy.repository.AdminDetailsRepository;

@Service
public class AdminDetailsService {

    private final AdminDetailsRepository adRepo;

    public AdminDetailsService(AdminDetailsRepository adRepo) {
        this.adRepo = adRepo;
    }

    public String checkAdmin(String username, String password) {

        System.out.println("Username received: " + username);
        System.out.println("Password received: " + password);

        AdminDetails adminDetails = adRepo.findByUserName(username);

        if (adminDetails == null) {
            System.out.println("Admin not found!");
            return "fail";
        }

        System.out.println("Database username: " + adminDetails.getUserName());
        System.out.println("Database password: " + adminDetails.getPassword());

        if (adminDetails.getPassword().equals(password)) {
            return "success";
        }

        return "fail";
    }
}
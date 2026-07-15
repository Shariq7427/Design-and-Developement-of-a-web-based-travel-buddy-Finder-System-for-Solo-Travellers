package com.travelbuddy.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.travelbuddy.entity.AdminDetails;
import com.travelbuddy.repository.AdminDetailsRepository;
import com.travelbuddy.service.AdminDetailsService;

@RestController
@CrossOrigin(origins = "*")
public class AdminDetailsController {

    private final AdminDetailsRepository adRepo;
    private final AdminDetailsService adService;

    public AdminDetailsController(AdminDetailsRepository adRepo,
                                  AdminDetailsService adService) {
        this.adRepo = adRepo;
        this.adService = adService;
    }

    @PostMapping("/addAdmin")
    public AdminDetails adminAdd(@RequestBody AdminDetails adminDetails) {
        return adRepo.save(adminDetails);
    }

    @GetMapping("/adminCheck")
    public String checkAdmin(
            @RequestParam String username,
            @RequestParam String password) {

        return adService.checkAdmin(username, password);
    }
}
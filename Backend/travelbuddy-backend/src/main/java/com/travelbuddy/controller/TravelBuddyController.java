package com.travelbuddy.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.travelbuddy.entity.TravelBuddy;
import com.travelbuddy.repository.TravelBuddyRepository;
import com.travelbuddy.service.TravelBuddyService;

@RestController
@CrossOrigin(origins = "*")
public class TravelBuddyController {

    private final TravelBuddyRepository tbRepo;
    private final TravelBuddyService tbService;

    public TravelBuddyController(
            TravelBuddyRepository tbRepo,
            TravelBuddyService tbService) {

        this.tbRepo = tbRepo;
        this.tbService = tbService;
    }

    @PostMapping("/signup")
    public TravelBuddy userAdd(@RequestBody TravelBuddy travelBuddy) {

        System.out.println("Signup request received");
        System.out.println(travelBuddy);

        return tbRepo.save(travelBuddy);
    }

    @GetMapping("/login")
    public String checkLogin(
            @RequestParam String username,
            @RequestParam String password) {

        return tbService.checkLogin(username, password);
    }

    @GetMapping("/userCheck")
    public String checkUser(
            @RequestParam String username) {

        return tbService.checkUser(username);
    }
}
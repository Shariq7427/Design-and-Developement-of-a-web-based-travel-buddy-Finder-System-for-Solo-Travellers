package com.travelbuddy.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.travelbuddy.entity.UserApplication;
import com.travelbuddy.repository.UserApplicationRepository;
import com.travelbuddy.service.UserApplicationService;

@RestController
@CrossOrigin(origins = "*")
public class UserApplicationController {

    private final UserApplicationRepository uaRepo;
    private final UserApplicationService uaService;

    public UserApplicationController(UserApplicationRepository uaRepo,
                                     UserApplicationService uaService) {
        this.uaRepo = uaRepo;
        this.uaService = uaService;
    }

    @DeleteMapping("/deleteapplication")
    public void deleteApplication(@RequestParam String username) {
        uaRepo.deleteByName(username);
    }

    @PostMapping("/userapplications")
    public UserApplication applicationAdd(@RequestBody UserApplication application) {
        return uaRepo.save(application);
    }

    @GetMapping("/applications")
    public List<UserApplication> getAllUsers() {
        return uaRepo.findAll();
    }

    @GetMapping("/applicationCheck")
    public String checkApplication(@RequestParam String username) {
        return uaService.checkApplication(username);
    }
}
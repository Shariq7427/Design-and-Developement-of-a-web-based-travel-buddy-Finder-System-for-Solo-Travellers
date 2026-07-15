package com.travelbuddy.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.travelbuddy.entity.UserRequest;
import com.travelbuddy.repository.UserRequestRepository;
import com.travelbuddy.service.UserRequestService;

@RestController
@CrossOrigin(origins = "*")
public class UserRequestController {

    private final UserRequestRepository requestRepo;
    private final UserRequestService requestService;

    public UserRequestController(UserRequestRepository requestRepo,
                                 UserRequestService requestService) {
        this.requestRepo = requestRepo;
        this.requestService = requestService;
    }

    @PostMapping("/requests")
    public UserRequest requestAdd(@RequestBody UserRequest request) {
        return requestRepo.save(request);
    }

    @DeleteMapping("/requestResponse")
    public void deleteRequest(@RequestParam String username) {
        requestRepo.deleteByRequestTo(username);
    }

    @GetMapping("/requestCheck")
    public String checkRequest(@RequestParam String username) {
        return requestService.checkRequest(username);
    }

    @GetMapping("/requestNotification")
    public String displayRequest(@RequestParam String username) {
        return requestService.displayRequest(username);
    }

    @GetMapping("/requestOne")
    public String oneRequest(@RequestParam String username) {
        return requestService.oneRequest(username);
    }
}
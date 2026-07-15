package com.travelbuddy.service;

import org.springframework.stereotype.Service;

import com.travelbuddy.entity.UserRequest;
import com.travelbuddy.repository.UserRequestRepository;

@Service
public class UserRequestService {

    private final UserRequestRepository urRepo;

    public UserRequestService(UserRequestRepository urRepo) {
        this.urRepo = urRepo;
    }

    public String checkRequest(String username) {

        if (username == null) {
            return "fail";
        }

        UserRequest request = urRepo.findByRequestTo(username);

        if (request != null &&
                request.getRequestTo().equals(username)) {
            return "success";
        }

        return "fail";
    }

    public String displayRequest(String username) {

        if (username == null || username.isEmpty()) {
            return "Invalid UserName";
        }

        UserRequest request = urRepo.findByRequestTo(username);

        if (request == null) {
            return "No Request";
        }

        return request.getRequestFrom();
    }

    public String oneRequest(String username) {

        if (username == null || username.isEmpty()) {
            return "No Request";
        }

        UserRequest request = urRepo.findByRequestTo(username);

        if (request == null) {
            return "No Request";
        }

        return request.getRequestFrom();
    }
}
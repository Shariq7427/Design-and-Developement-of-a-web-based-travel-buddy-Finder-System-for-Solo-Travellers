package com.travelbuddy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travelbuddy.entity.AdminDetails;

@Repository
public interface AdminDetailsRepository extends JpaRepository<AdminDetails, Integer> {

    AdminDetails findByUserName(String userName);

}
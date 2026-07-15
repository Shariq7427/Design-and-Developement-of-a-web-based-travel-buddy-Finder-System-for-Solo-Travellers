package com.travelbuddy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.travelbuddy.entity.VolunteerApplication;

@Repository
public interface VolunteerApplicationRepository extends JpaRepository<VolunteerApplication, Integer> {

    @Query(value = "SELECT * FROM volunteer_application ORDER BY RAND() LIMIT 1", nativeQuery = true)
    VolunteerApplication findRandomVolunteer();

}
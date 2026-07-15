package com.travelbuddy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.travelbuddy.entity.DriverDetails;

@Repository
public interface DriverDetailsRepository extends JpaRepository<DriverDetails, Integer> {

    @Query(value = "SELECT * FROM driver_details ORDER BY RAND() LIMIT 1", nativeQuery = true)
    DriverDetails findRandomDriverName();

}
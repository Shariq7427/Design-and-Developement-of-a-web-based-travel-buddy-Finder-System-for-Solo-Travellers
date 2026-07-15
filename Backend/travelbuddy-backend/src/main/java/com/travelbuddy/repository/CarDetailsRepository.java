package com.travelbuddy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.travelbuddy.entity.CarDetails;

@Repository
public interface CarDetailsRepository extends JpaRepository<CarDetails, Integer> {

    @Query(value = "SELECT * FROM car_details ORDER BY RAND() LIMIT 1", nativeQuery = true)
    CarDetails findRandomCarNumber();

}
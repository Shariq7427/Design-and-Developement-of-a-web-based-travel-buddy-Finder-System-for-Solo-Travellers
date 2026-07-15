package com.travelbuddy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.travelbuddy.entity.TourGuideDetails;

@Repository
public interface TourGuideDetailsRepository extends JpaRepository<TourGuideDetails, Integer> {

    @Query(value = "SELECT * FROM tour_guide_details ORDER BY RAND() LIMIT 1", nativeQuery = true)
    TourGuideDetails findRandomTourGuide();

}
package com.travelbuddy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travelbuddy.entity.TravelBuddy;

@Repository
public interface TravelBuddyRepository extends JpaRepository<TravelBuddy, Integer> {

    TravelBuddy findByUserName(String userName);

}
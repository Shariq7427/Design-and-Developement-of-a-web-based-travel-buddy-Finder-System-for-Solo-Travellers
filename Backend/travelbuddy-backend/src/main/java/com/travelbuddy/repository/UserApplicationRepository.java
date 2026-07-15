package com.travelbuddy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.travelbuddy.entity.UserApplication;

@Repository
public interface UserApplicationRepository extends JpaRepository<UserApplication, Integer> {

    UserApplication findByName(String name);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM user_application WHERE name = ?1", nativeQuery = true)
    int deleteByName(String name);

}
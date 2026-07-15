package com.travelbuddy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.travelbuddy.entity.UserRequest;

@Repository
public interface UserRequestRepository extends JpaRepository<UserRequest, Integer> {

    UserRequest findByRequestTo(String name);

    UserRequest findByRequestFrom(String name);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM user_request WHERE request_to = ?1", nativeQuery = true)
    int deleteByRequestTo(String name);

}
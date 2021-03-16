package com.belladev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.belladev.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{

}

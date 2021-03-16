package com.belladev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.belladev.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}

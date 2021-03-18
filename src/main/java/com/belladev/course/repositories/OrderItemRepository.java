package com.belladev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.belladev.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}

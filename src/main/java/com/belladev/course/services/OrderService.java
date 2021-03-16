package com.belladev.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.belladev.course.entities.Order;
import com.belladev.course.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	public List<Order> listar() {
		return orderRepository.findAll();
	}

	public Order buscarPorId(Long id) {
		Optional<Order> obj = orderRepository.findById(id);
		return obj.get();
	}
}

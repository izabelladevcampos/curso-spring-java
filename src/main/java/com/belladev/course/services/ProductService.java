package com.belladev.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.belladev.course.entities.Product;
import com.belladev.course.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public List<Product> listar() {
		return productRepository.findAll();
	}

	public Product buscarPorId(Long id) {
		Optional<Product> obj = productRepository.findById(id);
		return obj.get();

	}
}

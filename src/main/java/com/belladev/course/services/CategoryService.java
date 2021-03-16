package com.belladev.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.belladev.course.entities.Category;
import com.belladev.course.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	public List<Category> listar() {
		return categoryRepository.findAll();
	}

	public Category buscarPorId(Long id) {
		Optional<Category> obj = categoryRepository.findById(id);
		return obj.get();
	}
}

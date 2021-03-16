package com.belladev.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.belladev.course.entities.User;
import com.belladev.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> listar() {
		return userRepository.findAll();
	}

	public User buscarPorId(Long id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.get();
	}

}

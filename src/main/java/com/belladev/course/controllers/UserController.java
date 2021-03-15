package com.belladev.course.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.belladev.course.entities.User;


@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@GetMapping
	public ResponseEntity<User> listar(){
		User u = new User(1L, "Maria", "maria@gmail.com", "999-999", "12345");
		return ResponseEntity.ok().body(u);
	}

}

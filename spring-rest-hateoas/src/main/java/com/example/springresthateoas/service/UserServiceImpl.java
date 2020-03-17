package com.example.springresthateoas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.example.springresthateoas.model.User;
import com.example.springresthateoas.repository.UserRepository;

public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	public User saveUser(User user) {
		return userRepository.save(user);
	}
}

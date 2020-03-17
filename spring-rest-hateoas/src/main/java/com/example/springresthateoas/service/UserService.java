package com.example.springresthateoas.service;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;

import com.example.springresthateoas.model.User;

public interface UserService {

	User saveUser(@Valid User user);

}

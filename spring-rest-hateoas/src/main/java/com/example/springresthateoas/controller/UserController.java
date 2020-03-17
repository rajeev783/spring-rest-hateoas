package com.example.springresthateoas.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.springresthateoas.model.User;
import com.example.springresthateoas.service.UserService;

@RestController
public class UserController implements UserApi {
	
	@Autowired
	private UserService userService;

	@Override
	public ResponseEntity<User> addNewUser(@Valid User user) {
		User userObj = userService.saveUser(user);
		return new ResponseEntity<User>(userObj, HttpStatus.OK);
	}
	
	

}

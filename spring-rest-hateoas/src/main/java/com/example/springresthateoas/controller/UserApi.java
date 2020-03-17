package com.example.springresthateoas.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.springresthateoas.model.User;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

public interface UserApi {

	@ApiOperation (value = "addNewUser", nickname = " addNewUserUsingPOST", notes = "")
	@PostMapping(value = "/users/v1", produces = "application / json")
	ResponseEntity<User> addNewUser(@ApiParam(value = "user", required = true) @Valid @RequestBody User user);
}
 
package com.example.springresthateoas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springresthateoas.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

package com.example.springresthateoas.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//@Getter
public class User {

	@Id
	private long userId;
	private String userName;
	private Address address;
}

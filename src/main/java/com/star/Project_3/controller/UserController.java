package com.star.Project_3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.star.Project_3.model.User;
import com.star.Project_3.service.UserService;

/*
 1. @Controller-----------> calls to ---> @Service 
 2. @Service--------------> calls to ---> @Repository
 3. @Repository-----------> calls to ---> @Model / Entity file. 
 */

@RestController
public class UserController {
	
	@Autowired
	UserService userservice;
	
	@PostMapping("/user") 
	/* here, @PostMapping refers to the saving the data of User.java (Entity file),
	 which is then followed by UserService */
	public User saveUser(@RequestBody User user) {
		return userservice.saveUser(user);
	}
	
	@GetMapping("/get-user")
	public List<User> getUser(){
		return userservice.getUser();
	}
	
}

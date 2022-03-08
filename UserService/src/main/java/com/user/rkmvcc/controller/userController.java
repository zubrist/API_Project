package com.user.rkmvcc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.rkmvcc.entities.User;
import com.user.rkmvcc.service.UserServices;

import java.util.List;


@RestController
public class userController {
	
	@Autowired
	private UserServices userServices;

	@GetMapping("/users")
	
	public List <User> getUser(){
		
		return this.userServices.getUser();
		
	}
	
	@PostMapping("/users")
	public User addUser(@RequestBody User user) {
		return this.userServices.addUser(user);
	}
}

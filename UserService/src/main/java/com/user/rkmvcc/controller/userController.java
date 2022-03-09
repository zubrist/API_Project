package com.user.rkmvcc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.rkmvcc.entities.User;
import com.user.rkmvcc.service.UserServices;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/users")
public class userController {
	
	@Autowired
	private UserServices userServices;

	@GetMapping("/listUsers")
	
	public List <User> getUser(){
		
		return this.userServices.getUsers();
		
	}
	
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		return this.userServices.addUser(user);
	}
	
	@GetMapping("/{userId}")
	public Optional<User> getUser(@PathVariable String userId) {
		
		return this.userServices.getUser(userId);
	}
}

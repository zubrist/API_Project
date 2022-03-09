package com.user.rkmvcc.service;

import java.util.List;
import java.util.Optional;

import com.user.rkmvcc.entities.User;


public interface UserServices {
	
	
	public List<User> getUsers();
	
	public User addUser(User user);
		
		
	public Optional<User> getUser(String userId);
	}



package com.user.rkmvcc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.rkmvcc.entities.User;
import com.user.rkmvcc.Dao.UserDao;

@Service
public class userServicesImpl implements UserServices{
	
	@Autowired
	private UserDao userDao;
	
	public userServicesImpl() {
		
	}
	@Override
	public List<User> getUser() {
		
		return userDao.findAll() ;
	}
	
	@Override
	public User addUser(User user) {
		userDao.save(user);
		//list.add(user);
		return user;

}
}
	

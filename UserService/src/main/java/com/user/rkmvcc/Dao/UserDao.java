package com.user.rkmvcc.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.rkmvcc.entities.User;

public interface UserDao extends  JpaRepository<User, String> {

}

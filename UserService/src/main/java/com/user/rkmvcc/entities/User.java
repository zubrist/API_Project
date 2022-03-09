package com.user.rkmvcc.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User{

	
	@Id
	private String id;// Student Id or Employee Id
	private String name;
	private String type;// The value should be T or S
	private String email; //validation should be there
	private String password;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", type=" + type + ", email=" + email + ", password=" + password
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String id, String name, String type, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.email = email;
		this.password = password;
	}
}

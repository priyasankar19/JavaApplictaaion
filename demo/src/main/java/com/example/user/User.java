package com.example.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@Entity
@Table(name="Login",catalog="mysql")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;

	@Column(name="name")
	 String name;
	@Column(name="password")
	 String password;
	
	public User() {
		
	}

	public User(int id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}

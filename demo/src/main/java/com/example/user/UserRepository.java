package com.example.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> ,JpaRepository<User,Integer>
	{

	User findByname(String name);
	}
package com.example.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
@Service
public class UserService
{@Autowired
	UserRepository dr;
	private BCryptPasswordEncoder bcrpt;
	public void save(@ModelAttribute("user") User user) 
	{
		user.setPassword(bcrpt.encode(user.getPassword()));
		dr.save(user);
	}
	public User find(String name)
	{
		return dr.findByname(name);
	}
}

package com.example.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
@Service
public class UserValidation implements Validator{
@Autowired
UserService urs;
	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validate(Object o, Errors errors) {
		User user=(User) o;
	ValidationUtils.rejectIfEmpty(errors, "name", "e01");
	if(urs.find(user.getName())!=null)
	{
		errors.rejectValue("name", "e02");
	}
		
	}

}

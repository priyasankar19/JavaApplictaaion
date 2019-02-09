package com.example.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController 
{
	@Autowired
	UserRepository rep;
	@Autowired
	UserService userservice;
	@Autowired
	UserValidation valid;
	private BCryptPasswordEncoder bcrpt;
	@GetMapping("/create")
	public String createuser(Model model)
	{
		model.addAttribute("user",new User());
		return "CreateUser.jsp";
		
	}
	
	  @PostMapping("/createUser") 
	  public String save(@ModelAttribute("user") User user,BindingResult bindingResult) 
	  {
		  valid.validate(user,bindingResult);
		  if(bindingResult.hasErrors())
		  {
			  return "CreateUser.jsp";
		  }
	// user.setPassword(bcrpt.encode(user.getPassword()));
	  rep.save(user);
	  return "success.jsp";
	  }
@GetMapping("/login")
public String login()
{
	return "Login.jsp";
}
@PostMapping("/login")
public String post()
{
	return "success.jsp";
	
}
}

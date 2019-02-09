package com.example.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class DemoControllerview {
	@Autowired
	DemoRepository dr;
	 @RequestMapping(value="/")
	 public String student()
	 {
		 return "form.jsp";
	 }
	 @GetMapping("/Registration")
	    public String formGet(Model model) 
	 {
		 model.addAttribute("dm",new DemoModel());
	        return "Registration.jsp";
	   }
	@PostMapping("/Registration")
	public String Postdata(@ModelAttribute("dm") DemoModel dm)
	{
		dr.save(dm);
		return "success.jsp";
	}
	
}

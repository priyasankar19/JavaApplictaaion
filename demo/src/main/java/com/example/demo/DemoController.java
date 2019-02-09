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

@RestController
public class DemoController {
	@Autowired
	DemoService dm;
	@Autowired
	DemoRepository demorep;
	 
	 @RequestMapping(value="/get")
 public List<DemoModel> get() 
	 { 
		 return dm.get();
	 }
	
	 @RequestMapping("{id}")
	 public List<DemoModel> getById(@PathVariable(value="id") int id) 	
	 {
		return null;
		 
	 }
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public void savedata( @RequestBody DemoModel data)

	{ 
		 dm.save(data);
	}

}


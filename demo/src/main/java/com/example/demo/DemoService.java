package com.example.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class DemoService
{
	@Autowired
	DemoRepository demorep;
	
	HashMap<Integer,String> hm=new HashMap<>();


public void save(DemoModel data) 
{
demorep.save(data);
}


public List<DemoModel> get() {
	
	return demorep.findAll();
}


}


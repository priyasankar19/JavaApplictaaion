package com.example.demo;
import java.util.HashMap;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
public interface DemoRepository extends CrudRepository<DemoModel,Integer> ,JpaRepository<DemoModel,Integer>
{


	
}

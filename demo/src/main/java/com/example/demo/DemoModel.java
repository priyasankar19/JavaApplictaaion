package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="demomodel",catalog="mysql")
public class DemoModel
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Studentid")
int id;
	@Column(name="name")
String name;
	@Column(name="department")
String dept;
	@Column(name="year")
String year;
public DemoModel() {
		
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
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public String getYear() {
	return year;
}
public void setYear(String year) {
	this.year = year;
}	


}

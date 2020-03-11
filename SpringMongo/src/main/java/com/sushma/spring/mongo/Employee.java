package com.sushma.spring.mongo;

public class Employee {
String id;
String name;
String dept;
String project;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(String name, String dept, String project) {
	super();
	
	this.name = name;
	this.dept = dept;
	this.project = project;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", project=" + project + "]";
}



}

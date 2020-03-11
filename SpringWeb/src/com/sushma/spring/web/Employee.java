package com.sushma.spring.web;

public class Employee {
  String id;
  String name;
  String dept;
  String project;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(String id, String name, String department, String project) {
	super();
	this.id = id;
	this.name = name;
	this.dept = department;
	this.project = project;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", department=" + dept + ", project=" + project + "]";
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDepartment() {
	return dept;
}
public void setDepartment(String department) {
	this.dept = department;
}
public String getProject() {
	return project;
}
public void setProject(String project) {
	this.project = project;
}
  
}

package com.sushma.app;

public class Employee {
int id;
String name;
String project;
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
public String getProject() {
	return project;
}
public void setProject(String project) {
	this.project = project;
}
public Employee(int id, String name, String project) {
	super();
	this.id = id;
	this.name = name;
	this.project = project;
}

}

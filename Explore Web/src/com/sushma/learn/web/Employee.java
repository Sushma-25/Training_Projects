package com.sushma.learn.web;

public class Employee {
	int id;
	String name;
	String project;
	String dept;

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
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

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", project=" + project + ", dept=" + dept + "]";
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String project, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.project = project;
		this.dept = dept;
	}

}

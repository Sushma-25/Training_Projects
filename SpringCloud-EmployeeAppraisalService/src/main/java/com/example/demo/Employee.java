package com.example.demo;

import java.util.Arrays;

public class Employee {
int id;
String name;
String[] appraisalRatings;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int id, String name, String[] appraisalRatings) {
	super();
	this.id = id;
	this.name = name;
	this.appraisalRatings = appraisalRatings;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", appraisalRatings=" + Arrays.toString(appraisalRatings) + "]";
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
public String[] getAppraisalRatings() {
	return appraisalRatings;
}
public void setAppraisalRatings(String[] appraisalRatings) {
	this.appraisalRatings = appraisalRatings;
}


}

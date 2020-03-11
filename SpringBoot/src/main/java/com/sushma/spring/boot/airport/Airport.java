package com.sushma.spring.boot.airport;

public class Airport {
int id;
String name;
String city;
String state;
public Airport() {
	super();
	// TODO Auto-generated constructor stub
}
public Airport(int id, String name, String city, String state) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
	this.state = state;
}
@Override
public String toString() {
	return "Airport [id=" + id + ", name=" + name + ", city=" + city + ", state=" + state + "]";
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
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}


}

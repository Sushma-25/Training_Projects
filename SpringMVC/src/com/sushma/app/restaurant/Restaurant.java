package com.sushma.app.restaurant;

public class Restaurant {
int id;
String name;
String location;
String cuisine;
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
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getCuisine() {
	return cuisine;
}
public void setCuisine(String cuisine) {
	this.cuisine = cuisine;
}
public Restaurant(String name, String location, String cuisine) {
	super();
	this.name = name;
	this.location = location;
	this.cuisine = cuisine;
}
@Override
public String toString() {
	return "Restaurant [id=" + id + ", name=" + name + ", location=" + location + ", cuisine=" + cuisine + "]";
}
public Restaurant() {
	super();
}


}

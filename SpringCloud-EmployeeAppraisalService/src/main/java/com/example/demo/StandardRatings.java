package com.example.demo;

public class StandardRatings {
int id;
String name;
public StandardRatings() {
	super();
	// TODO Auto-generated constructor stub
}
public StandardRatings(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
@Override
public String toString() {
	return "StandardRatings [id=" + id + ", name=" + name + "]";
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

}

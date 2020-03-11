package com.sushma.spring.boot.railway;

public class Train {
  String name;
  String fromCity;
  String toCity;
  String type;
public Train() {
	super();
	// TODO Auto-generated constructor stub
}

public Train(String name, String fromCity, String toCity, String type) {
	super();
	this.name = name;
	this.fromCity = fromCity;
	this.toCity = toCity;
	this.type = type;
}
@Override
public String toString() {
	return "Train [name=" + name + ", fromCity=" + fromCity + ", toCity=" + toCity + ", type=" + type + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getFromCity() {
	return fromCity;
}
public void setFromCity(String fromCity) {
	this.fromCity = fromCity;
}
public String getToCity() {
	return toCity;
}
public void setToCity(String toCity) {
	this.toCity = toCity;
}
}

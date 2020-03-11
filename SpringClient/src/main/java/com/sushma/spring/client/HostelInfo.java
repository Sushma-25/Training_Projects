package com.sushma.spring.client;

public class HostelInfo {
	int id;
	String name;
	String location;
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
	@Override
	public String toString() {
		return "HostelInfo [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	public HostelInfo(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}
	public HostelInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}

package com.sushma.app.vendor.beans;

public class Vendor {
	int id;
	String name;
	String location;
	String service;

	public Vendor() {
		super();
	}

	public Vendor(int id, String name, String location, String service) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.service = service;
	}

	@Override
	public String toString() {
		return "Vendor [id=" + id + ", name=" + name + ", location=" + location + ", service=" + service + "]";
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

}

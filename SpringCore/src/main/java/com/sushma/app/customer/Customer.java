package com.sushma.app.customer;

public class Customer {
	int id;

	String name;
	String Location;
	String product;

	String representative;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", Location=" + Location + ", product=" + product
				+ ", representative=" + representative + "]";
	}

	public Customer(int id, String name, String location, String product, String representative) {
		super();
		this.id = id;
		this.name = name;
		Location = location;
		this.product = product;
		this.representative = representative;
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
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getRepresentative() {
		return representative;
	}

	public void setRepresentative(String representative) {
		this.representative = representative;
	}

}

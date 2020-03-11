package com.sushma.app.sales;

public class Item {
	String productName;
	float cost;
	int quantity;
	int id;
	float taxAmount;
	@Override
	public String toString() {
		return "Item [productName=" + productName + ", cost=" + cost + ", quantity=" + quantity + ", id=" + id
				+ ", taxAmount=" + taxAmount + "]";
	}
	public Item(String productName, float cost, int quantity, int id, float taxAmount) {
		super();
		this.productName = productName;
		this.cost = cost;
		this.quantity = quantity;
		this.id = id;
		this.taxAmount = taxAmount;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(float taxAmount) {
		this.taxAmount = taxAmount;
	}
	public Item() {
		super();
	}
	

	
}

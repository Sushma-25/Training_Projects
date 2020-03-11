package com.sushma.Assesment;

public class ShoppingCartDetails {
	String product;
	int quantity;
	float price;
	String status;

	
	@Override
	public String toString() {
		return "ShoppingCartDetails [product=" + product + ", quantity=" + quantity + ", price=" + price
				+ ", status=" + status + "]";
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public ShoppingCartDetails(String product, int quantity, float price) {
		super();
		this.product = product;
		this.quantity = quantity;
		this.price = price;
	}
	public ShoppingCartDetails() {
		super();
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}

package com.system.Constructors;

public class ConstructorDemo {

	public static void main(String[] args) {
     Computer c=new Computer();
   
     c.setManufacturer("Dell Inc");
     c.setModel("xyz");
     c.setCost(89067);
     System.out.println(c);
     Computer ibm=new Computer("IBM Corp.","Think Pad",99000);
	System.out.println(ibm);}

}
class Computer
{
	String manufacturer;
	String model;
	long cost;
	
	public Computer() {
		super();
	}
	public Computer(String manufacturer, String model, long cost) {
		super();
		this.manufacturer = manufacturer;
		this.model = model;
		this.cost = cost;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public long getCost() {
		return cost;
	}
	public void setCost(long cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Computer [manufacturer=" + manufacturer + ", model=" + model + ", cost=" + cost + "]";
	}
	
}

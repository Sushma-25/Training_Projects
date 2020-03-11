package com.system.variables;

public class StaticVariableDemo {
public static void main(String[] args) {
	Vendor iiht=new Vendor();
	iiht.createVendor("shyaam");
	iiht.totalVendors();
	Vendor HungerBox=new Vendor();
	HungerBox.createVendor("Hunger Box Service");
	HungerBox.totalVendors();
	Vendor srs=new Vendor();
	srs.createVendor("SRS Transportation Service");
	srs.totalVendors();
	//System.out.println("jzxh "+totalVendors);
}
}
class Vendor
{
	public static int totalVendors;
	//String Name;
	void createVendor(String name)
	{
		//Name=name;
	System.out.println("Creating Vendor !!"+name);
	totalVendors++;
	}
	void totalVendors()
	{
		System.out.println("No of Vendors : "+totalVendors);
	}
}

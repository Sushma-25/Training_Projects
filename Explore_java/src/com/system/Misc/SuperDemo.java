package com.system.Misc;

public class SuperDemo {
public static void main(String[] args) {
	ServiceCompany sc=new ServiceCompany();
	sc.info();
}
}
class Company
{

	public Company(int value) {
		super();//ctrl+click takes to object class as it is company parent
  System.out.println("Company Constructor");
  }
	void info()
	{
		System.out.println("Company.info()");
	}
}
class ServiceCompany extends Company
{

	public ServiceCompany() {
		super(100);
		// TODO Auto-generated constructor stub
	}

	
 
}

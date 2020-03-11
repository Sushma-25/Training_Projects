package com.system.functions;

public class StaticKeywordDemo {
public static void main(String[] args) {
	//Company ibm=new Company();
			//ibm.getFounder();
			Company.getFounder();
			
}
}
class Company
{
	static void getFounder()
	{
		System.out.println("Thomas J. Watson");
	}
}
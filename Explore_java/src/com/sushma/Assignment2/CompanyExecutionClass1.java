package com.sushma.Assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompanyExecutionClass1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i;
		List<CompanyClass1> companylist=new ArrayList<CompanyClass1>();
		CompanyCrudClass c=new CompanyCrudClass();
		while(true)
		{System.out.println("Enter \n 1:Create Employee\n2:Retrieve Employee\n3:Update Employee\n4:Delete Employee\n5:Quit");
	switch (s.nextInt()) {
	case 1:
		int localinput;
		System.out.println("Enter number of companies ");
		localinput=s.nextInt();
		
		for(i=0;i<localinput;i++)
			{
			companylist.add(c.createEmployee());
			}
		System.out.println("Done...");
		break;
case 2:
	
	c.retrievedetails(companylist);
	
		break;
case 3:
	c.updatedetails(companylist); 
	
	break;
case 4:
	
	c.deletedetails(companylist);
	
	break;
	
case 5:
	System.exit(0);
	break;

	default:
		break;
	}}}

}

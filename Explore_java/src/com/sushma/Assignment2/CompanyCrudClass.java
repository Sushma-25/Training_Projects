package com.sushma.Assignment2;

import java.util.List;
import java.util.Scanner;

public class CompanyCrudClass  {
    //Create company
	int i;
	String Companyid,location,name,founder;
	Scanner s=new Scanner(System.in);
	CompanyClass1 createEmployee()
	 {
		 System.out.println("Enter Company ID");
	  Companyid=s.nextLine();
	  System.out.println("Enter Company Name");
	  name=s.nextLine();
	  System.out.println("Enter Company Location");
	  location=s.nextLine();
	  System.out.println("Enter Company Founder");
	  founder=s.nextLine();
	  CompanyClass1 c=new CompanyClass1();
	  c.setCompanyid(Companyid);
     c.setFounder(founder);
     c.setLocation(location);
     c.setName(name);
     return c;
		 
	 }
	//Retrieve 
	public void retrievedetails(List<CompanyClass1> companylist) {
		
		System.out.println("Enter 1:Retrieve one Company Details \n2:Retrieve all");
		switch (s.nextInt()) {
		case 1:
			System.out.println("Enter id");
			String inputid=s.next();
			
			for ( i = 0; i <companylist.size(); i++) {
					
					  if(inputid.equals(companylist.get(i).getCompanyid())) {
					  System.out.println(companylist.get(i));
					  break;
					  }
					 
			}
			//System.out.println("i value"+i+"size is"+companylist.size());
			 if(i==companylist.size())
				  System.out.println("Entered id does not exists");
			break;
		case 2:
			for (CompanyClass1 companyClass : companylist) {
				System.out.println(companyClass);
			}break;
		default:
			break;
		}
	}
	//Update
	public void updatedetails(List<CompanyClass1> companylist) {
		System.out.println("enter id whose details you want to update");
		  String inputid=s.next();
		  
			for ( i = 0; i < companylist.size(); i++) {
				  if(inputid.equals(companylist.get(i).getCompanyid())) {
					 System.out.println("Enter 1:update Location \n 2:Founder");
					 switch (s.nextInt()) {
					case 1:
						String newlocation;
						System.out.println("Enter new location");
						newlocation=s.next();
						companylist.get(i).setLocation(newlocation);
						break;
	                case 2:
	                	String newfoundername;
	                	System.out.println("Enter Value to update");
						newfoundername=s.next();
						companylist.get(i).setLocation(newfoundername);
						break;

					default:
						break;
					}
					  
					  
					  break;
				  }
			}
			 if(i==companylist.size())
					  System.out.println("Entered id does not exists");
		
	}
	//Delete
	public void deletedetails(List<CompanyClass1> companylist) {
		System.out.println("Enter 1:Delete one Company Details \n2:Delete all");
		switch (s.nextInt()) {
		case 1:
			System.out.println("Enter id");
			String inputid1=s.next();
			
			for ( i = 0; i < companylist.size(); i++) {
				  if(inputid1.equals(companylist.get(i).getCompanyid())) {
					 companylist.remove(companylist.get(i)); 
				 break;
				 }
			}
			 if(i==companylist.size())
					  System.out.println("Entered id does not exists");
			break;
		case 2:
			
			for ( i = 0; i < companylist.size(); i++) {
				 companylist.remove(companylist.get(i)); 
				
				 }
			
			 break;
		default:
			break;
		}		
	}
	
	
	
	   
	
	
	
	
	
}

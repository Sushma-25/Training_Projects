package com.sushma.ExceptionsDemo;

import java.util.Scanner;

public class CustomExceptionDemo {

	public static void main(String[] args) throws GroupcountException {
          Scanner s=new Scanner(System.in);
       try {
			createGroup(s);
		
		  } catch (GroupcountException e) { // TODO Auto-generated catch block
		  //e.printStackTrace(); 
			  System.out.println(e.getMessage()); }
		  
	}

	private static void createGroup(Scanner s) throws GroupcountException {
	     System.out.println("Please Specify the group count");
         int groupcount=Integer.parseInt(s.nextLine());
         if(groupcount>8)
       	throw new GroupcountException("Exceeds.....");
         
         else
       	  System.out.printf("Group created..with %d members",groupcount);
     
	}

}

class GroupcountException extends Exception
{
	
	
	public GroupcountException(String emsg) {
		super(emsg);
		
	}

	

	
}

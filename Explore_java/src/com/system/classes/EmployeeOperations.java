package com.system.classes;

import java.util.Scanner;

import com.system.Assignment.CreateEmployee;

public class EmployeeOperations {
    int id;
    String name,dept,projectname;
	//Create Employee
	CreateEmployee createEmployee()
	{ Scanner s=new Scanner(System.in);
	System.out.println("Enter ID :");
	id=s.nextInt();
	System.out.println("Enter Name :");
	name=s.nextLine();
	System.out.println("Enter Dept :");
	dept=s.nextLine();
	System.out.println("Enter Project:");
	projectname=s.nextLine();
	CreateEmployee c=new CreateEmployee(id,name,dept,projectname);
	return c;
	}
	
	
	
	//Retrieve Employee
	
	
	
	//Delete Employee
	
	
	//Update Employee
}

package com.system.classes;

public class EmployeeDemo {
public static void main(String[] args) {
	
	System.out.println("---Employee application");
	Employee sushma=new Employee();
	sushma.setEmpdept("Product Devolopment");
	sushma.setEmpname("Sushma");
	//sushma.setEmpId(123);
	sushma.setProjectname("Micro Services");
	int empid = 0;
System.out.println(sushma);
EmployeeOperations crud=new EmployeeOperations();
//int empid=crud.createEmployee();
System.out.println("Generated id is "+empid);

sushma.setEmpId(empid);
System.out.println(sushma);
}

}


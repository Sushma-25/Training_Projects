package com.sushma.app;

import org.junit.Assert;
import org.junit.Before;

import org.junit.Test;

public class EmployeeopsTest {
	static Employeeops eops;
	Employee emp1;
	Employee emp2;

	@Before
	public void intialization() {
		eops = new Employeeops();
		 emp1=new Employee(1,"sushma","cloud");
		 emp2=new Employee(2,"suma","Fullstack");
		
	}

	@Test
	public void testEmployeeMap() {

				Assert.assertEquals(0, eops.getEmployee());
	}
	
   @Test
	public void beforeTest()
	{ eops.createEmployee(emp1);
	eops.createEmployee(emp2);
	  Assert.assertEquals(2, eops.getEmployee());
			
	}

}

package com.sushma.learn.web;

import java.sql.SQLException;

public class EmployeeController {
		
		public int createEmployee(String name, String project, String department) throws ClassNotFoundException, SQLException {
		
		System.out.println("Controller...");

		Employee emp = new Employee();
		emp.setName(name);
		emp.setProject(project);
		emp.setDept(department);
        System.out.println("Customer :"+emp);
		
	EmployeeService service=new EmployeeService();
	int id=service.allot(emp);
	emp.setId(id);
	return id;
	}
}

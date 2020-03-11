package com.sushma.learn.web;

import java.sql.SQLException;

public class EmployeeService {
  

    
	/*
	 * @Autowired public void setDao(CustomerDao dao) { this.dao = dao; }
	 */

	// function gets the object from controller and assigns representative

	public int allot(Employee emp) throws ClassNotFoundException, SQLException {
		EmployeeDao dao=new EmployeeDao();
		int id=dao.insertEmployee(emp);
		return id;
	}

	
}

package com.sushma.spring.web;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Qualifier("mysql")
	@Autowired
	EmployeeDAO dao;
	public List<Employee> getEmployees() throws ClassNotFoundException, SQLException {
     
	List<Employee>	empData=dao.getEmployeeData();
		
	
		return empData;
	}

}

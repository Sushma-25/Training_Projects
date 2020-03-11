package com.sushma.spring.web;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAO {

	List<Employee> getEmployeeData() throws ClassNotFoundException, SQLException;

}

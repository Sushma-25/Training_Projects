package com.sushma.spring.web;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
Employee empl=new Employee();
empl.setId(rs.getString("id"));
empl.setName(rs.getString("name"));
empl.setDepartment(rs.getString("dept"));
empl.setProject(rs.getString("project"));
		
		return empl;
	}

}

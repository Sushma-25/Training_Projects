package com.sushma.spring.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
Employee empl=new Employee();
empl.setId(rs.getInt("id"));
empl.setName(rs.getString("name"));
empl.setDept(rs.getString("dept"));
empl.setProject(rs.getString("project"));
	
		return empl;
	}

}

package com.sushma.spring.web;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;
import com.sushma.spring.web.Employee;
import com.sushma.spring.web.EmployeeMapper;


@Qualifier("mysql")
@Repository
public class MysqlDAO implements EmployeeDAO {
    
	
	@Override
	public List<Employee> getEmployeeData() throws ClassNotFoundException, SQLException {
       
		JdbcTemplate template=new JdbcTemplate();
		template.setDataSource(dataSource());
		List<Employee> emplist = template.query("select * from employee", new EmployeeMapper());
		for (Employee employee : emplist) {
			System.out.println(employee);
		}
		return emplist;
	}

	private DataSource dataSource() {
	
			DriverManagerDataSource ds = new DriverManagerDataSource();
			ds.setDriverClassName("com.mysql.jdbc.Driver");
			ds.setUrl("jdbc:mysql://localhost:3306/ibm");
			ds.setUsername("root");
			ds.setPassword("sushma");

			return ds;
		
	}

	
	
	
	
	}



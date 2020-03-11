package com.sushma.spring.jdbc;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class AccessSqlData {

public AccessSqlData() {
		ApplicationContext ac = new AnnotationConfigApplicationContext(SQLConfig.class);
		JdbcTemplate jtemplate = ac.getBean(JdbcTemplate.class);
		List<Passenger> emplist = jtemplate.query("select * from passenger", new PassengerMapper());
		
		for (Passenger passenger : emplist) {
			
		}
		
		 Object[] params = new Object[] {78,"xcd","sjdh","jdzhf" };
	      
		jtemplate.update("INSERT INTO employee VALUES (?, ?, ?, ?);",params);
		
	}

}

@Configuration
class SQLConfig {
	@Bean
	JdbcTemplate getJTemplate() {
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(dataSource());

		return template;
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
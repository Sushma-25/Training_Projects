package com.sushma.app.customer;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sushma.app.sales.SalesDao;

public class CustomerApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Customer target = new Customer();
		//CustomerController cOps = new CustomerController();
		//CustomerController cOps =(CustomerController) appContext.getBean("customcon");
		
		
		ApplicationContext appContext=new AnnotationConfigApplicationContext(CustomerConfig.class);
		CustomerController cOps =appContext.getBean(CustomerController.class);
		cOps.createCustomer("Khol's","Watson","USA");
	}

}
@Configuration
@ComponentScan
class CustomerConfig{
			
	}

	/*
	 * private CustomerService getService() { CustomerService cs=new
	 * CustomerService(); cs.setDao(getDAO()); return cs; }
	 * 
	 * private CustomerDao getDAO() { return new CustomerDao(); }
	 */

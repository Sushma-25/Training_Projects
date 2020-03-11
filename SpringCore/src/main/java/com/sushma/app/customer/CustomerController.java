package com.sushma.app.customer;


import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService service;
	
	/*
	 * @Autowired public CustomerController(CustomerService service) { super();
	 * this.service = service;
	 }*/



	// Creates Customer Object
	void createCustomer(String name, String product, String location) throws ClassNotFoundException, SQLException {
		System.out.println("Controller...");

		Customer cust = new Customer();
		cust.setName(name);
		cust.setLocation(location);
		cust.setProduct(product);
        System.out.println("Customer :"+cust);
		
		service.assignRepresentative(cust);
		
	}
}

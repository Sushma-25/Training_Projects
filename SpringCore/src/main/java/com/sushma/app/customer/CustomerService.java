package com.sushma.app.customer;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
//@Component
public class CustomerService {
   @Autowired
	CustomerDao dao;
    
	/*
	 * @Autowired public void setDao(CustomerDao dao) { this.dao = dao; }
	 */

	// function gets the object from controller and assigns representative
	void assignRepresentative(Customer cust) throws ClassNotFoundException, SQLException {
		System.out.println("--Service");

		System.out.println("Before :" + cust);

		if (cust.getLocation().equalsIgnoreCase("india"))
			cust.setRepresentative("Shiva Sagar");
		else
			cust.setRepresentative("Sushma Talakal");

		System.out.println("After :" + cust);
		
		
		dao.insertCustomer(cust);
	}

	
}

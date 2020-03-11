package com.sushma.app.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.sushma.app.sales.DbHelper;

@Repository
public class CustomerDao {
   Connection con;
	public void insertCustomer(Customer cust) throws SQLException, ClassNotFoundException {
      System.out.println("DAO-----");
     
      System.out.println("Before :" + cust);
      int tempCustomerId=(int)(Math.random()*1000);
      cust.setId(tempCustomerId);
      System.out.println("After :" + cust);
      
		con=DbHelper.getConnection();
		PreparedStatement prepstat = con.prepareStatement("insert into customer(name,location,product,representative) values(?,?,?,?);");
		
		prepstat.setString(1, cust.getName());
		prepstat.setString(2, cust.getLocation());
		prepstat.setString(3, cust.getProduct());
		prepstat.setString(4, cust.getRepresentative());
		prepstat.execute();
		System.out.println("Object got inserted successfully");
     
	}
}

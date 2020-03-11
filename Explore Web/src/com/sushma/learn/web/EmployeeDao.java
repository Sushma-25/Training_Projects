package com.sushma.learn.web;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDao {
   Connection con;
	public int insertEmployee(Employee emp) throws ClassNotFoundException, SQLException {
		 System.out.println("DAO-----");
	     int id=0;
	      System.out.println("Before :" + emp);
	      int tempCustomerId=(int)(Math.random()*1000);
	      emp.setId(tempCustomerId);
	      System.out.println("After :" + emp);
	      
			con=DbHelper.getConnection();
			PreparedStatement prepstat = con.prepareStatement("insert into employee(name, project,dept) values(?,?,?);",Statement.RETURN_GENERATED_KEYS);
			
			prepstat.setString(1, emp.getName());
			prepstat.setString(2, emp.getProject());
			prepstat.setString(3, emp.getDept());
			prepstat.execute();
			ResultSet rs=prepstat.getGeneratedKeys();
			while (rs.next()) {               // Position the cursor                  4 
				id=	rs.getInt(1);
				System.out.println("id is "+id);                                  // Print the column values
			
			}
			System.out.println("Object got inserted successfully");
	     return id;
	}
}

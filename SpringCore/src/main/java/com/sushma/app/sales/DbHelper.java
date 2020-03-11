package com.sushma.app.sales;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {

	static Connection con ;
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{Class.forName("com.mysql.jdbc.Driver");
	System.out.println("Driver is loaded");
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ibm", "root", "sushma");
	System.out.println("Connection Successful");
	return con;
}
}

package com.sushma.app.sales;

public class SalesDao {

	public void genrateid(Item item) {
		int id = (int) (Math.random() * 1000);
		item.setId(id);
		/*
		 * Connection con = DbHelper.getConnection(); PreparedStatement prepstat = con.
		 * prepareStatement("insert into sales(product_name ,quantity ,cost,tax_amount) values(?,?,?,?);"
		 * );
		 * 
		 * 
		 * prepstat.execute(); System.out.println("Object got inserted successfully");
		 */

	}

}

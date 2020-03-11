package com.sushma.app.sales;

public class SaleService {
	SalesDao dao;
	int port;

	public void setDao(SalesDao dao) {
		this.dao = dao;
	}

	
	  public void setPort(int port) { this.port = port; }
	 

	public void calculateTaxAmount(Item item) {
		System.out.println(port);
		if (item.cost > 1000) {
			item.setTaxAmount((float) (item.cost * 5) / 100 * item.getQuantity());
		} else
			item.setTaxAmount((float) (item.cost * 8) / 100 * item.getQuantity());

		dao.genrateid(item);

	}

}

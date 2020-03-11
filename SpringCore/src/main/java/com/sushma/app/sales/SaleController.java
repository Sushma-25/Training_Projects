package com.sushma.app.sales;

public class SaleController {

	SaleService service;
	String dev;

	public SaleController(SaleService service, String name) {
		super();
		this.service = service;
		this.dev = name;
		System.out.println("Developer name : " + dev);
	}

	public void createItem(String string, float f, int i) {
		Item item = new Item();
		item.setProductName(string);
		item.setQuantity(i);
		item.setCost(f);
		System.out.println("Item Before :" + item);

		service.calculateTaxAmount(item);
		System.out.println("Item After :" + item);

	}

}

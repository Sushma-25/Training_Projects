package com.sushma.app.sales;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class SaleExecution {

	public static void main(String[] args) {

		// SaleController controller=new SaleController();
		// controller.createItem("Laptop",50000f,10);

		BeanFactory beans = new XmlBeanFactory(new ClassPathResource("sales.xml"));
		SaleController salecontrol = beans.getBean(SaleController.class);
		salecontrol.createItem("Laptop", 50000f, 10);
	}

}

package com.sushma.app.vendor.exec;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sushma.app.vendor.beans.Vendor;
import com.sushma.app.vendor.crud.VendorOps;

@SuppressWarnings("deprecation")
public class VendorDemo {
	static VendorOps crud;

	public static void main(String[] args) {
		Vendor iiht = new Vendor();
		iiht.setId(123);
		iiht.setName("Indian institute of hardware technology");
		iiht.setLocation("Bangalore");
		iiht.setService("Corporate Training");
		// = new VendorOps();

		BeanFactory myBeans = new XmlBeanFactory(new ClassPathResource("sushma.xml"));
		crud = myBeans.getBean(VendorOps.class);
		crud.createVendor(iiht);
	}

}

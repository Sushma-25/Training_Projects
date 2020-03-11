package com.sushma.app.vendor.crud;

import com.sushma.app.vendor.beans.Vendor;

public class VendorOps {
	public void createVendor(Vendor ven) {
		System.out.printf("Adding Vendor(%s) to the system", ven.getName());

	}
}

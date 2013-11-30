package com.shopeezz.rest.services.impl;

import java.util.List;

import com.shopeezz.rest.model.CustPurchaseItemList;
import com.shopeezz.rest.model.Item;
import com.shopeezz.rest.services.Customer;
import com.shopeezz.rest.services.Order;
import com.shopeezz.rest.services.Vendor;

public class VendorService implements Vendor {

	@Override
	public String createVendor(String name, String phone, String shopName,
			String shopNumer, String floor, String street, String city,
			String pincode, String latitude, String longitude) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addProductCatalog(List<Item> items, Vendor vendor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean confirmOrder(Order order) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Vendor> getVendorList(CustPurchaseItemList itemList,
			Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

}

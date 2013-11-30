package com.shopeezz.rest.services.impl;

import java.util.List;

import com.shopeezz.rest.model.Item;
import com.shopeezz.rest.services.Customer;

public class CustomerService implements Customer {

	@Override
	public String createUser(String name, String phone, String houseNo,
			String houseFloor, String street, String city, String pincode) {
		// TODO Auto-generated method stub
		
		String hell = "this is a string";
		
		return hell;
	}

	@Override
	public Customer getCustomerByCustId(String customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addPurchaseItemList(List<Item> productItemList) {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.shopeezz.rest.services.impl;

import com.shopeezz.rest.model.CustPurchaseItemList;
import com.shopeezz.rest.model.Vendor;
import com.shopeezz.rest.services.Customer;
import com.shopeezz.rest.services.Order;

public class OrderService implements Order {

	@Override
	public Order createOrder(CustPurchaseItemList purchaseItemList,
			Customer customer, Vendor vendor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean cancelOrder(Order order) {
		// TODO Auto-generated method stub
		return false;
	}

}

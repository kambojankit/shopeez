package com.shopeezz.rest.dao.impl;

import com.mongodb.DBObject;
import com.shopeezz.rest.dao.OrderDBAPI;

public class OrderDAO implements OrderDBAPI {

	@Override
	public String placeOrder(long orderListID, String customer_id,
			String vendor_id) {
		
		return null;
	}

	@Override
	public DBObject trackOrder(String orderID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateOrder(String orderID, String field, String value,
			String action) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean cancelOrder(String orderID, String message) {
		// TODO Auto-generated method stub
		return false;
	}

}

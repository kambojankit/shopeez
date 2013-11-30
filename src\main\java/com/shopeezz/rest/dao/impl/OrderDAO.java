package com.shopeezz.rest.dao.impl;

import com.mongodb.DBObject;
import com.shopeezz.rest.dao.OrderDBAPI;
import com.shopeezz.rest.model.Order;

public class OrderDAO implements OrderDBAPI {

	@Override
	public String placeOrder(Order order) {
		
		return "12345";
	}

	@Override
	public DBObject trackOrder(String orderID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateOrder(String orderID) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean cancelOrder(String orderID) {
		// TODO Auto-generated method stub
		return true;
	}

}

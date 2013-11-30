package com.shopeezz.rest.services.impl;

import com.shopeezz.rest.dao.OrderDBAPI;
import com.shopeezz.rest.dao.impl.OrderDAO;
import com.shopeezz.rest.model.CustPurchaseItemList;
import com.shopeezz.rest.model.Customer;
import com.shopeezz.rest.model.Order;
import com.shopeezz.rest.model.Vendor;
import com.shopeezz.rest.services.OrderBase;

public class OrderService implements OrderBase {
	OrderDBAPI orderDao;
	
	public OrderService(){
		orderDao = new OrderDAO();
	}
	@Override
	public String createOrder(Order order) {
		// TODO Auto-generated method stub
		return orderDao.placeOrder(order);
	}

	public boolean updateOrder(String orderId){
		return orderDao.updateOrder(orderId);
	}
	
	@Override
	public boolean cancelOrder(String orderId) {
		return orderDao.cancelOrder(orderId);
	}

}

package com.shopeezz.rest.services.impl;

import java.net.UnknownHostException;
import java.util.ArrayList;

import org.apache.log4j.Logger;

import com.mongodb.BasicDBObject;
import com.shopeezz.rest.dao.CustomerDBAPI;
import com.shopeezz.rest.dao.NotificationAPI;
import com.shopeezz.rest.dao.impl.CustomerDAO;
import com.shopeezz.rest.dao.impl.NotificationDAO;
import com.shopeezz.rest.model.CustPurchaseItemList;
import com.shopeezz.rest.model.Customer;
import com.shopeezz.rest.model.Order;
import com.shopeezz.rest.model.Vendor;
import com.shopeezz.rest.services.CustomerBase;
import com.shopeezz.rest.services.OrderBase;

public class CustomerService implements CustomerBase {
	Logger logger = Logger.getLogger("CustomerService");
	
	CustomerDBAPI customerDao;
	
	public CustomerService(){
		try {
			customerDao = new CustomerDAO();
		} catch (UnknownHostException e) {
			logger.error("Error creating Database entity");
		}
	}
	@Override
	public boolean createUser(String name, String phone, String houseNo,
			String houseFloor, String street, String city, String pincode,  String longi, String lati) {
		 
		Customer customer = new Customer(name, phone, phone, houseNo, houseFloor, street, city, pincode);
		ArrayList<String> location = new ArrayList<String>();
		location.add(longi);
		location.add(lati);
		
		BasicDBObject dbObj= new BasicDBObject();
		dbObj.append("location", location);
		
		
		return customerDao.createCustomer(phone, name, houseNo +" " + houseFloor + " " + street+ " "+city+" "+ pincode , phone, "", dbObj);
		
	}

	@Override
	public Customer getCustomerByCustId(String customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addPurchaseItemList(CustPurchaseItemList productItemList,Vendor vendor) {
		
		//Create Order List in DB and get the list ID
		//		customerDao.createOrderList(list);
		
		// Create an order 
		Order order = new Order();
		order.setCustPurchaseItemList(productItemList);
		order.setProductVendor(vendor);
		
		//Insert order and generate order ID
		OrderBase orderBase = new OrderService();
		String orderId = orderBase.createOrder(order);
		
		// Send Notification to Vendor
		NotificationAPI notify = new NotificationDAO();
		return notify.placeVendorNotification(orderId);
		
	}

}

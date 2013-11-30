package com.shopeezz.rest.services.impl;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import com.mongodb.BasicDBObject;
import com.shopeezz.rest.dao.NotificationAPI;
import com.shopeezz.rest.dao.VendorDBAPI;
import com.shopeezz.rest.dao.impl.NotificationDAO;
import com.shopeezz.rest.dao.impl.VendorDAO;
import com.shopeezz.rest.model.CustPurchaseItemList;
import com.shopeezz.rest.model.Customer;
import com.shopeezz.rest.model.Item;
import com.shopeezz.rest.model.Vendor;
import com.shopeezz.rest.services.OrderBase;
import com.shopeezz.rest.services.VendorBase;

public class VendorService implements VendorBase {
	Logger logger = Logger.getLogger("Vendor Service");
	
	VendorDBAPI vendorDao;
	
	public VendorService(){
		try {
			vendorDao = new VendorDAO();
		} catch (UnknownHostException e) {
			logger.error("error starting DB");
		}
	}
	
	@Override
	public boolean createVendor(String name, String phone, String shopName,
			String shopNumer, String floor, String street, String city,
			String pincode, String latitude, String longitude) {
		// TODO Auto-generated method stub
		
		Vendor vendor  = new Vendor(name, phone, phone, shopNumer, floor, street, city, pincode, latitude, longitude);
		
		ArrayList<String> location = new ArrayList<String>();
		location.add(longitude);
		location.add(latitude);
		
		BasicDBObject dbObj= new BasicDBObject();
		dbObj.append("location", location);
		
		Date date = new Date() ;
		
		return vendorDao.createVendor(phone, shopName, phone, "", shopNumer +" " + floor + " " + street+ " "+city+" "+ pincode , shopName, date, dbObj);
	}

	@Override
	public boolean addProductCatalog(List<Item> items, Vendor vendor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean confirmOrder(String orderId, boolean isConfirmed) {
		OrderBase orderBase= new OrderService();
		
		if(isConfirmed){
		
		NotificationAPI notify = new NotificationDAO();
		notify.placeCustomerNotification(orderId, true);
		return orderBase.updateOrder(orderId);
		
		}else{
			
			NotificationAPI notify = new NotificationDAO();
			notify.placeCustomerNotification(orderId, false);
			return orderBase.cancelOrder(orderId);
		}
		
	}

	@Override
	public List<Vendor> getVendorList(CustPurchaseItemList itemList,
			Customer customer) {
		return vendorDao.getVendorList(itemList, customer);
		
	}

}

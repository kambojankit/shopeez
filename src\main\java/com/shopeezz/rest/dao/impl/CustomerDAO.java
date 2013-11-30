package com.shopeezz.rest.dao.impl;

import java.net.UnknownHostException;
import java.util.ArrayList;

import org.apache.log4j.Logger;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.WriteConcern;
import com.shopeezz.rest.dao.CustomerDBAPI;

public class CustomerDAO implements CustomerDBAPI{
	Logger logger = Logger.getLogger(CustomerDAO.class);
	Mongo conn = null;
	DB db = null;
	DBCollection coll = null;
	public CustomerDAO() throws UnknownHostException {
		
		conn = new Mongo("localhost", 27017);
		db = conn.getDB("shopeezz");
		db.setWriteConcern(WriteConcern.JOURNALED);
		coll = db.getCollection("customer_info");
	}
	@Override
	public boolean createCustomer(String customer_id, String name,
			String address,String phone, String email, DBObject location) {
		if (customer_id == null || name == null || address == null || phone == null || location == null) {
			logger.error("Problem in input data in createCustomer method");
			return false;
		} 
		
		BasicDBObject customerDetails = new BasicDBObject().append("_id", customer_id)
												.append("name", name)
												.append("address",address)
												.append("phone", phone)
												.append("address", location);
		if (email != null) {
			customerDetails.append("email", email);
		}
		try {
			coll.insert(customerDetails);
		} catch (Exception e) {
			logger.error("Caught exception while creating new customer document for input data " + customerDetails.toString() + " Exception : " + e.getMessage());
			return false;
		}
		logger.info("New Customer added successfully");
		return true;
	}

	@Override
	public boolean updateCustomer(String customer_id, String field_name,
			String value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean createOrderList(BasicDBObject list) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addToTrustedList(String customer_id, String vendor_id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeFromTrustedList(String customer_id, String vendor_id,
			String message) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<DBObject> getTrustedList(String customer_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addReview(String customer_id, String review, float rating) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int checkUserExist(String customer_id) {
		
		try {
			DBCursor curr = coll.find(new BasicDBObject("_id",customer_id));
			if (curr.count() > 0) {
				return 1;
			} else {
				return 0;
			}
		} catch(Exception e) {
			logger.info("Caught exception while checking the customer already exist in database");
			return 2;
		} 
	}


}

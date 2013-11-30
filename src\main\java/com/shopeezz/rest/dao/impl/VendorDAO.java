package com.shopeezz.rest.dao.impl;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.WriteConcern;
import com.shopeezz.rest.dao.VendorDBAPI;
import com.shopeezz.rest.model.CustPurchaseItemList;
import com.shopeezz.rest.model.Customer;
import com.shopeezz.rest.model.Vendor;

public class VendorDAO implements VendorDBAPI {
	Logger logger = Logger.getLogger("VendorDAO");
	Mongo conn = null;
	DB db = null;
	DBCollection coll = null;
	public VendorDAO() throws UnknownHostException { 
		conn = new Mongo("54.254.192.194", 27017);
		db = conn.getDB("shopeezz");
		db.setWriteConcern(WriteConcern.JOURNALED);
		coll = db.getCollection("vendor_info");
	}

	@Override
	public boolean createVendor(String vendor_id, String shop_name,
			String phone, String email, String address, String contact_person,
			Date created_on, DBObject location) {
		
		// Check all the input data for not null condition for mandatory fields
		if (vendor_id == null || shop_name == null || phone == null || contact_person == null || location == null || address == null || created_on == null) {
			logger.error("Problem in input data in createVendor method");
			return false;
		}
		
		BasicDBObject vendorDetails = new BasicDBObject().append("_id", vendor_id)
											.append("shopName", shop_name)
											.append("phone",phone)
											.append("address", address)
											.append("contactPerson", contact_person)
											.append("createTS", created_on)
											.append("address", location)
											.append("isActive", true);
		if (email!=null) {
			vendorDetails.append("email", email);
		}
		
		try {
			coll.insert(vendorDetails);
		} catch (Exception e) {
			logger.error("Caught exception while creating new vendor document for input data " + vendorDetails.toString() + " Exception : " + e.getMessage());
			return false;
		}
		logger.info("New Vendor added successfully");
		return true;
	}

	@Override
	public boolean updateVendor(String vendor_id, String update_key,
			Object value) {
		if (update_key.equals("_id")) {
			logger.error("Change of vendor ID is not allowed");
			return false;
		}
		try {
		coll.update(new BasicDBObject().append("_id", vendor_id), new BasicDBObject("$set",new BasicDBObject(update_key,value)));
		coll.update(new BasicDBObject().append("_id", vendor_id), new BasicDBObject("$set",new BasicDBObject("lastUpdatedTS",new Date())));
		} catch (Exception e) {
			logger.error("Caught exception while updating the vendor record for vendor_id : " + vendor_id + " update key : "+ update_key + " update value  : " + value + " Exception : " + e.getMessage());
			return false;
		}
		logger.info("Vendor " + vendor_id + " successfully updated");
		return true;
	}

	@Override
	public boolean deleteVendor(String vendor_id, String reason) {
		try {
			boolean soft_delete_upddate = false;
			soft_delete_upddate = updateVendor(vendor_id, "deleteMessage", reason);
			soft_delete_upddate = updateVendor(vendor_id, "isActive", false);
			if(soft_delete_upddate) {
				logger.info("Soft Delete of vendor_id : " + vendor_id + " is complete due to vendor reason : " + reason);
				return true;
			} else {
				logger.error("Soft delete failed..!");
				return false;
			}
				
		} catch(Exception e) {
			logger.error("Caught exception while performing soft delete on vendor : "+ vendor_id + " Exception : " + e.getMessage());
		}
		return false;
	}

	@Override
	public boolean addProductCatalog(String vendor_id, String item_name,
			String brand, float price) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateProduct(String vendor_id, String item_name,
			String brand, float price) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<String> getCustomerList(String vendor_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean rateCustomer(String customer_id, int rating) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<DBObject> getOrderHistoryForCustomer(String vendor,
			String customer_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DBObject getVendorDetails(String vendor_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vendor> getVendorList(CustPurchaseItemList itemList,
			Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<DBObject> getVendorSellList(String vendor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<DBObject> getMultiVendorProductAvailList(DBObject list,
			Object location) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<DBObject> getVendorProductAvailList(DBObject list,
			String vendor_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean blackListCustomer(String vendor_id, String customer_id,
			String message) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int checkUserExist(String vendor_id) {
		try {
			DBCursor curr = coll.find(new BasicDBObject("_id",vendor_id));
			if (curr.count() > 0) {
				return 1;
			} else {
				return 0;
			}
		} catch(Exception e) {
			logger.info("Caught exception while checking the vendor already exist in database");
			return 2;
		} 
	}
}

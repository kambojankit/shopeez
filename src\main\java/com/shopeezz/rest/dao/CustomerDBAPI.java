package com.shopeezz.rest.dao;

import java.util.ArrayList;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

public interface CustomerDBAPI {

	/**
	 * This function will create users or customers
	 * 
	 * @param customer_id
	 * @param name
	 * @param address
	 * @param phone
	 * @param emailc
	 * @return true : Creation success, false : Creation failure
	 */
	boolean createCustomer(String customer_id, String name, String address, String phone,String email,DBObject location);
	
	/**
	 * This method checks if the customer already exists in database
	 * @param customer_id
	 * @return true : 1 customer exist, 0 : if customer does not exist and 2 if something went wrong in transmission
	 */
	int checkUserExist(String customer_id);

	/**
	 * This function will update the customer information
	 * @param customer_id
	 * @param field_name
	 * @param value
	 * @return true : Update success, false : Update failure
	 */
	boolean updateCustomer(String customer_id, String field_name, String value);
	
	/**
	 * This function will create order list in the server with several status
	 * @param list
	 * @return true : Creation success, false : Creation failure
	 */
	Integer createOrderList(BasicDBObject list, String custID);
	
	/**
	 * This function us used to add vendors to trusted list
	 * @param customer_id
	 * @param vendor_id
	 * @return  true : Creation success, false : Creation failure
	 */
	boolean addToTrustedList(String customer_id,String vendor_id);
	
	/**
	 * This function is used to remove a trusted vendor from the list by a message
	 * @param customer_id
	 * @param vendor_id
	 * @return true : Removal success, false : Removal failure
	 */
	boolean removeFromTrustedList(String customer_id,String vendor_id, String message);
	
	/**
	 * This function is used to get the list of all trusted vendors in the TustedVendors list
	 * @param customer_id
	 * @return
	 */
	ArrayList<DBObject> getTrustedList(String customer_id);
	
	/**
	 * This function is used to add review regarding the vendor
	 * @param customer_id
	 * @param review
	 * @param rating
	 * @return
	 */
	boolean addReview(String customer_id, String review, float rating);	
	
}

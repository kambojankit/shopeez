package com.shopeezz.rest.dao;

import com.mongodb.DBObject;
import com.shopeezz.rest.model.Order;

public interface OrderDBAPI {
	
	/**
	 * This function will place a list created by the customer for ordering with a particular vendor
	 * @param orderListID
	 * @param customer_id
	 * @param vendor_id
	 * @return OrdertID in the form of String
	 */
	String placeOrder(Order order);
	
	/**
	 * This function is used to track the order/display the status of the order items
	 * @param orderID
	 * @return DBObject containing list of items and price details 
	 */
	DBObject trackOrder(String orderID);
	
	/**
	 * This function is used to update the ordered items
	 * @param orderID
	 * @param field
	 * @param value
	 * @param action
	 * @return true : Update Successful, false : Update Failed
	 */
	boolean updateOrder(String orderID);
	
	/**
	 * This function is used to cancel the order and add a message stating the reason for the cancellation
	 * @param orderID
	 * @param message
	 * @return true : Cancel success, false: Cancel failed
	 */
	boolean cancelOrder(String orderID);
}

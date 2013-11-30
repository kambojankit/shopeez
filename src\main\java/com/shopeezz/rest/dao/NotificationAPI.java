package com.shopeezz.rest.dao;

public interface NotificationAPI {
	//this will place 1st notification for the customer that order is confirmed.
	public boolean placeCustomerNotification(String orderId, boolean isOrderConfirmed);
	
	public boolean placeVendorNotification(String orderId);
	
	
}

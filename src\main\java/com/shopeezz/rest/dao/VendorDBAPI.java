package com.shopeezz.rest.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mongodb.DBObject;
import com.shopeezz.rest.model.CustPurchaseItemList;
import com.shopeezz.rest.model.Customer;
import com.shopeezz.rest.model.Vendor;



public interface VendorDBAPI {
	/**
	 * This function will create a document/row for the vendor in the database system. Use when adding new vendors to system
	 * @param vendor_id
	 * @param shop_name
	 * @param phone
	 * @param email
	 * @param address
	 * @param contact_person
	 * @param created_on
	 * @param location
	 * @return true: insert Success, false: Insert failed
	 */
	boolean createVendor(String vendor_id,String shop_name, String phone,String email,String address, String contact_person,Date created_on, DBObject location);
	
	/**
	 * This function will update a particular vendor data with specified key and value
	 * @param vendor_id
	 * @param update_key
	 * @param value
	 * @return true: Update Success, false: Update failed
	 */
	
	/**
	 * This method checks if the vendor already exists in database
	 * @param vendor_id
	 * @return true : 1 vendor exist, 0 : if vendor does not exist and 2 if something went wrong in transmission
	 */
	int checkUserExist(String vendor_id);
	
	boolean updateVendor(String vendor_id,String update_key,Object value);
	
	/**
	 * This function will set the vendor active state to false. This will cause soft delete of vendor from system
	 * @param vendor_id
	 * @param reason
	 * @return true : Delete Success, false: Insert Success
	 */
	boolean deleteVendor(String vendor_id,String reason);
	
	/**
	 * This function will add product to product catalog database with respect
	 * @param vendor_id
	 * @param item_name
	 * @param brand
	 * @param price
	 * @return true : Product add Success, false: Product add Success
	 */
	boolean addProductCatalog(String vendor_id, String item_name, String brand, float price);
	
	/**
	 * This function will update a particular item of a vendor_id to updated price
	 * @param vendor_id
	 * @param item_name
	 * @param brand
	 * @param price
	 * @return true : Update Success, false: Update failed
	 */
	boolean updateProduct(String vendor_id, String item_name, String brand, float price);
	
	/**
	 * This function will return all the customer_ids who all have placed order id with particular vendor
	 * @param vendor_id
	 * @return ArrayList<String> containing all customer_ids
	 */
	ArrayList<String> getCustomerList(String vendor_id);
	
	/**
	 * This function will rate a particular customer with the given value
	 * @param customer_id
	 * @param rating
	 * @return true : Rating success, false : Rating failed
	 */
	boolean rateCustomer(String customer_id, int rating);
	
	/**
	 * This function will be used to get all the orders from a particular customer_id with a vendor
	 * @param vendor
	 * @param customer_id
	 * @return DBOject ArrayList with Json format
	 */
	ArrayList<DBObject> getOrderHistoryForCustomer(String vendor,String customer_id);
	
	/**
	 * This function will return all the details regarding the vendor
	 * @param vendor_id
	 * @return DBObject containing all the information regarding the vendor
	 */
	DBObject getVendorDetails(String vendor_id);
	
	/**
	 * This function will be used to get the list of vendors nearby location
	 * @param location Object containing key value pairs
	 * @return ArrayList<DBObject> containing vendor_id and name
	 */
	List<Vendor> getVendorList(CustPurchaseItemList itemList,
			Customer customer);
	
	/**
	 * This function will be used to get the list of items a vendor is selling
	 * @param vendor
	 * @return ArrayList<DBObject> containing the list of products and its price
	 */
	ArrayList<DBObject> getVendorSellList(String vendor);
	
	/**
	 * This function is used to find multiple vendor list availability near the location to find where products are available
	 * @param list
	 * @param location
	 * @return ArrayList<DBObject> containing vendors, items and price
	 */
	ArrayList<DBObject> getMultiVendorProductAvailList(DBObject list, Object location);
	
	/**
	 * This function is used to find vendor list availability of ordered items
	 * @param list
	 * @param vendor_id
	 * @return
	 */
	ArrayList<DBObject> getVendorProductAvailList(DBObject list, String vendor_id);
	
	/**
	 * This function is used to black list a customer who creates unnecessary orders
	 * @param vendor_id
	 * @param customer_id
	 * @param message
	 * @return true : Blacklisting success, false : Blacklisting failed
	 */
	boolean blackListCustomer(String vendor_id,String customer_id, String message);
	
}

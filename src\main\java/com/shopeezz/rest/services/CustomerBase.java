package com.shopeezz.rest.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.shopeezz.rest.model.CustPurchaseItemList;
import com.shopeezz.rest.model.Customer;
import com.shopeezz.rest.model.Vendor;


@Consumes("application/json")
@Produces("application/json")
public interface CustomerBase {
	
	@POST
	@Path("/createCustomer/")
	/**
	 * 
	 * @param name
	 * @param phone
	 * @param houseNo
	 * @param houseFloor
	 * @param street
	 * @param city
	 * @param pincode
	 * @return
	 */
	public boolean createUser(String name, String phone, String houseNo, String houseFloor, String street, String city, String pincode, String longi, String lati);


	@POST
	@Path("/getCustomerDetailsById/")
	/**
	 * This will create a new Customer.
	 * @param request
	 * @return
	 */
	public Customer getCustomerByCustId(String customerId);
	
	
	@POST
	@Path("/addPurchaseItemList/")
	/**
	 * This will create a new product list in DB for user.
	 * @param request
	 * @return id of purchase list created.
	 */
	public boolean addPurchaseItemList(CustPurchaseItemList productItemList, Vendor vendor);
	
	
}

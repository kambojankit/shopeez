package com.shopeezz.rest.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.shopeezz.rest.model.Item;


@Consumes("application/json")
@Produces("application/json")
public interface Customer {
	
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
	public String createUser(String name, String phone, String houseNo, String houseFloor, String street, String city, String pincode);


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
	public String addPurchaseItemList(List<Item> productItemList);
	
	
}

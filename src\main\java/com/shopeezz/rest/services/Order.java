package com.shopeezz.rest.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.shopeezz.rest.model.CustPurchaseItemList;
import com.shopeezz.rest.model.Vendor;


@Consumes("application/json")
@Produces("application/json")
public interface Order {
	
	@POST
	@Path("/createOrder/")
	public Order createOrder(CustPurchaseItemList purchaseItemList, Customer customer, Vendor vendor);

	@POST
	@Path("/cancelOrder/")
	public boolean cancelOrder(Order order);
}

package com.shopeezz.rest.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.shopeezz.rest.model.CustPurchaseItemList;
import com.shopeezz.rest.model.Customer;
import com.shopeezz.rest.model.Order;
import com.shopeezz.rest.model.Vendor;


@Consumes("application/json")
@Produces("application/json")
public interface OrderBase {
	
	@POST
	@Path("/createOrder/")
	public String createOrder(Order order);
	
	@POST
	@Path("/updateOrder/")
	public boolean updateOrder(String orderId);

	
	@POST
	@Path("/cancelOrder/")
	public boolean cancelOrder(String orderId);
}

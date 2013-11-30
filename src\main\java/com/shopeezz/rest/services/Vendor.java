package com.shopeezz.rest.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.shopeezz.rest.model.CustPurchaseItemList;
import com.shopeezz.rest.model.Item;


@Consumes("application/json")
@Produces("application/json")
public interface Vendor {

	@POST
	@Path("/createVendor/")
	public String createVendor(String name, String phone,String shopName, String shopNumer, String floor, String street, String city, String pincode, String latitude, String longitude);

	@POST
	@Path("/addProductCatalog/")
	public boolean addProductCatalog(List<Item> items, Vendor vendor);
	
	@POST
	@Path("/confirmOrder/")
	public boolean confirmOrder(Order order);
	
	@POST
	@Path("/getVendorList/")
	public List<Vendor> getVendorList(CustPurchaseItemList itemList, Customer customer);
	
}

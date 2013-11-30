package com.shopeezz.rest.model;

import java.util.List;

public class Order {
	String orderId;
    List<CustPurchaseItemList> custPurchaseItemList;  
    Vendor productVendor;
    private int deliveryTime;
    
    
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public List<CustPurchaseItemList> getCustPurchaseItemList() {
		return custPurchaseItemList;
	}
	public void setCustPurchaseItemList(
			List<CustPurchaseItemList> custPurchaseItemList) {
		this.custPurchaseItemList = custPurchaseItemList;
	}
	public Vendor getProductVendor() {
		return productVendor;
	}
	public void setProductVendor(Vendor productVendor) {
		this.productVendor = productVendor;
	}
	public int getDeliveryTime() {
		return deliveryTime;
	}
	public void setDeliveryTime(int deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
    
    
}

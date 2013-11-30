package com.shopeezz.rest.model;

import java.util.List;

public class Vendor {
	String vendorName;
	String vendorId;
	String vendorPhone;
	
	String vendorShopNumber;
	String vendorShopFloorNumber;
	String vendorStreet;
	String vendorCity;
	String vendorPincode;
	String vendorLandmark;
	
	String latitude;
	String longitude;
	
	String vendorRating;
	List<String> comments;
	List<Customer> customerList;
	List<Order> orderList;
	
	List<CustPurchaseItemList> customerOrdersList;
	Order CurrentOrder;
	
	List<VendorProductCatalog> ownedProductCatalog;

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorPhone() {
		return vendorPhone;
	}

	public void setVendorPhone(String vendorPhone) {
		this.vendorPhone = vendorPhone;
	}

	public String getVendorShopNumber() {
		return vendorShopNumber;
	}

	public void setVendorShopNumber(String vendorShopNumber) {
		this.vendorShopNumber = vendorShopNumber;
	}

	public String getVendorShopFloorNumber() {
		return vendorShopFloorNumber;
	}

	public void setVendorShopFloorNumber(String vendorShopFloorNumber) {
		this.vendorShopFloorNumber = vendorShopFloorNumber;
	}

	public String getVendorStreet() {
		return vendorStreet;
	}

	public void setVendorStreet(String vendorStreet) {
		this.vendorStreet = vendorStreet;
	}

	public String getVendorCity() {
		return vendorCity;
	}

	public void setVendorCity(String vendorCity) {
		this.vendorCity = vendorCity;
	}

	public String getVendorPincode() {
		return vendorPincode;
	}

	public void setVendorPincode(String vendorPincode) {
		this.vendorPincode = vendorPincode;
	}

	public String getVendorLandmark() {
		return vendorLandmark;
	}

	public void setVendorLandmark(String vendorLandmark) {
		this.vendorLandmark = vendorLandmark;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getVendorRating() {
		return vendorRating;
	}

	public void setVendorRating(String vendorRating) {
		this.vendorRating = vendorRating;
	}

	public List<String> getComments() {
		return comments;
	}

	public void setComments(List<String> comments) {
		this.comments = comments;
	}

	public List<Customer> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}

	public List<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}

	public List<CustPurchaseItemList> getCustomerOrdersList() {
		return customerOrdersList;
	}

	public void setCustomerOrdersList(List<CustPurchaseItemList> customerOrdersList) {
		this.customerOrdersList = customerOrdersList;
	}

	public Order getCurrentOrder() {
		return CurrentOrder;
	}

	public void setCurrentOrder(Order currentOrder) {
		CurrentOrder = currentOrder;
	}

	public List<VendorProductCatalog> getOwnedProductCatalog() {
		return ownedProductCatalog;
	}

	public void setOwnedProductCatalog(
			List<VendorProductCatalog> ownedProductCatalog) {
		this.ownedProductCatalog = ownedProductCatalog;
	}
}

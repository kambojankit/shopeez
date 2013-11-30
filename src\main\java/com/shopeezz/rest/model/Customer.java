package com.shopeezz.rest.model;

import java.util.Date;
import java.util.List;

public class Customer {
	String custName;
	String custId;
	String custPhone;
	
	String email;
	
	String custHouseNumber;
	String custHomeFloorNumber;
	String custStreet;
	String custCity;
	String custPincode;
	String custLandmark;
	
	private String longi;
	private String lati;
	String location;
	List<Vendor> trustedVendorList;
	List<CustPurchaseItemList> custPurchaseItemList;
	
	Order currentOrder;
	
	List<Order> orderHistory;
	Date startDate;
	
	public Customer(){
		
	}
	
	
	public Customer(String custName, String custId, String custPhone,
			 String custHouseNumber, String custHomeFloorNumber,
			String custStreet, String custCity, String custPincode) {
		super();
		this.custName = custName;
		this.custId = custId;
		this.custPhone = custPhone;
	
		this.custHouseNumber = custHouseNumber;
		this.custHomeFloorNumber = custHomeFloorNumber;
		this.custStreet = custStreet;
		this.custCity = custCity;
		this.custPincode = custPincode;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getCustPhone() {
		return custPhone;
	}
	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCustHouseNumber() {
		return custHouseNumber;
	}
	public void setCustHouseNumber(String custHouseNumber) {
		this.custHouseNumber = custHouseNumber;
	}
	public String getCustHomeFloorNumber() {
		return custHomeFloorNumber;
	}
	public void setCustHomeFloorNumber(String custHomeFloorNumber) {
		this.custHomeFloorNumber = custHomeFloorNumber;
	}
	public String getCustStreet() {
		return custStreet;
	}
	public void setCustStreet(String custStreet) {
		this.custStreet = custStreet;
	}
	public String getCustCity() {
		return custCity;
	}
	public void setCustCity(String custCity) {
		this.custCity = custCity;
	}
	public String getCustPincode() {
		return custPincode;
	}
	public void setCustPincode(String custPincode) {
		this.custPincode = custPincode;
	}
	public String getCustLandmark() {
		return custLandmark;
	}
	public void setCustLandmark(String custLandmark) {
		this.custLandmark = custLandmark;
	}
	public List<Vendor> getTrustedVendorList() {
		return trustedVendorList;
	}
	public void setTrustedVendorList(List<Vendor> trustedVendorList) {
		this.trustedVendorList = trustedVendorList;
	}
	public List<CustPurchaseItemList> getCustPurchaseItemList() {
		return custPurchaseItemList;
	}
	public void setCustPurchaseItemList(
			List<CustPurchaseItemList> custPurchaseItemList) {
		this.custPurchaseItemList = custPurchaseItemList;
	}
	public Order getCurrentOrder() {
		return currentOrder;
	}
	public void setCurrentOrder(Order currentOrder) {
		this.currentOrder = currentOrder;
	}
	public List<Order> getOrderHistory() {
		return orderHistory;
	}
	public void setOrderHistory(List<Order> orderHistory) {
		this.orderHistory = orderHistory;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public String getLongi() {
		return longi;
	}


	public void setLongi(String longi) {
		this.longi = longi;
	}


	public String getLati() {
		return lati;
	}


	public void setLati(String lati) {
		this.lati = lati;
	}
	
	
	
}

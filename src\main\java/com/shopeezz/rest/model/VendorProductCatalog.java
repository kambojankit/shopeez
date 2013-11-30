package com.shopeezz.rest.model;

import java.util.List;

public class VendorProductCatalog {
	String productCatalogId;
	
	List<Item> item;
	Vendor productCatalogOwner;
	public String getProductCatalogId() {
		return productCatalogId;
	}
	public void setProductCatalogId(String productCatalogId) {
		this.productCatalogId = productCatalogId;
	}
	public List<Item> getItem() {
		return item;
	}
	public void setItem(List<Item> item) {
		this.item = item;
	}
	public Vendor getProductCatalogOwner() {
		return productCatalogOwner;
	}
	public void setProductCatalogOwner(Vendor productCatalogOwner) {
		this.productCatalogOwner = productCatalogOwner;
	}
	
	
}

package com.shopeezz.rest.model;

import java.util.List;

public class CustPurchaseItemList {
	
	boolean listState;
	Customer listOwner;
	String listId;
	List<Item> itemList;
	
	public boolean isListState() {
		return listState;
	}
	public void setListState(boolean listState) {
		this.listState = listState;
	}
	public String getListId() {
		return listId;
	}
	public void setListId(String listId) {
		this.listId = listId;
	}
	public List<Item> getItemList() {
		return itemList;
	}
	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}
}


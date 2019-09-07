package com.training.ordmgmtprjcorejava.service;

import java.util.List;

import com.training.ordmgmtprjcorejava.model.Item;

public interface ItemService {
	
	public abstract List<Item> searchItemsByKeyword(String keyword);
	
	public abstract void displayItems(List<Item> itemList);

}

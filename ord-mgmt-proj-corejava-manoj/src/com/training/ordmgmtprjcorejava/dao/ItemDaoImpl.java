package com.training.ordmgmtprjcorejava.dao;

import java.util.ArrayList;
import java.util.List;

import com.training.ordmgmtprjcorejava.datastore.ItemDataStore;
import com.training.ordmgmtprjcorejava.model.Item;

public class ItemDaoImpl implements ItemDao{

	@Override
	public List<Item> searchItemsByKeyword(String keyword) {
		List<Item> itemList = ItemDataStore.getItemsList();
		List<Item> newItemList = new ArrayList<Item>();
		for(int i=0;i<itemList.size();i++) 
		{
			Item item = itemList.get(i);
			if(item.getItemName().contains(keyword)) 
			{
				newItemList.add(item);
			}
		}
		return newItemList;
	}

}

package com.training.ordmgmtprjcorejava.service;

import java.util.List;

import com.training.ordmgmtprjcorejava.dao.ItemDao;
import com.training.ordmgmtprjcorejava.factory.DaoObjectFactory;
import com.training.ordmgmtprjcorejava.model.Item;

public class ItemServiceImpl implements ItemService{

	@Override
	public List<Item> searchItemsByKeyword(String keyword) {
		ItemDao itemDao = DaoObjectFactory.getItemDao();
		List<Item> keywordItems = itemDao.searchItemsByKeyword(keyword);
		return keywordItems;
	}

	@Override
	public void displayItems(List<Item> itemList) {
		for(int i=0;i<itemList.size();i++) 
		{
			Item item = (Item) itemList.get(i);
			System.out.println(item);
		}
		
	}

}

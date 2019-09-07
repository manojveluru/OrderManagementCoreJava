package com.training.ordmgmtprjcorejava.datastore;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.training.ordmgmtprjcorejava.model.Item;

public class ItemDataStore {

	private static List<Item> itemsList = new ArrayList<Item>();

	public static List<Item> getItemsList() {
		return itemsList;
	}

	public static void setItemsList(List<Item> itemsList) {
		ItemDataStore.itemsList = itemsList;
	}
	
	static {
		Item item1 = new Item();

		int itemId = getRandomId();
		item1.setItemId(itemId);
		item1.setItemName("iphone x");
		item1.setItemDescription("Apple Iphone X 64gb");
		item1.setItemPrice(1000);
		item1.setOnSale(false);
		item1.setDiscount(0);

		Item item2 = new Item();

		itemId = getRandomId();
		item2.setItemId(itemId);
		item2.setItemName("iphone 8");
		item2.setItemDescription("Apple iPhone 8 128gb");
		item2.setItemPrice(800);
		item2.setOnSale(true);
		item2.setDiscount(10);

		Item item3 = new Item();

		itemId = getRandomId();
		item3.setItemId(itemId);
		item3.setItemName("Note 9");
		item3.setItemDescription("Samsung \"Note 9\" 128gb");
		item3.setItemPrice(1100);
		item3.setOnSale(true);
		item3.setDiscount(15);

		Item item4 = new Item();

		itemId = getRandomId();
		item4.setItemId(itemId);
		item4.setItemName("Dell Inspiron 15");
		item4.setItemDescription("Dell Inspiron has 17 processor ");
		item4.setItemPrice(2000);
		item4.setOnSale(false);
		item4.setDiscount(0);

		Item item5 = new Item();

		itemId = getRandomId();
		item5.setItemId(itemId);
		item5.setItemName("Google Ipad ");
		item5.setItemDescription("Googele Tablet ");
		item5.setItemPrice(900);
		item5.setOnSale(false);
		item5.setDiscount(0);

		itemsList.add(item1);
		itemsList.add(item2);
		itemsList.add(item3);
		itemsList.add(item4);
		itemsList.add(item5);
	}
	
	public static int getRandomId() 
	{
		Random rand = new Random();
		int itemId = rand.nextInt(100);
		return itemId;
	}
}

package com.training.ordmgmtprjcorejava.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.training.ordmgmtprjcorejava.dao.OrderDao;
import com.training.ordmgmtprjcorejava.factory.DaoObjectFactory;
import com.training.ordmgmtprjcorejava.model.Item;
import com.training.ordmgmtprjcorejava.model.Order;

public class OrderServiceImpl implements OrderService{

	Scanner sc = new Scanner(System.in);
	@Override
	public List<Item> getCartItems() {
		OrderDao orderDao = DaoObjectFactory.getOrderDao();
		return orderDao.getCartItems();
	}

	@Override
	public List<Item> getItemsSelected(List<Item> itemList) {
		List<Item> itemsList = new ArrayList<Item>();
		while(itemList != null) 
		{
			System.out.println("Please Enter the Item Id you wanted to buy?");
			int itemId = sc.nextInt();
			System.out.println("Please Enter the Quantity: ");
			int quantity = sc.nextInt();
			for(int i=0;i<itemList.size();i++) 
			{
				Item item = (Item) itemList.get(i);
				if(item.getItemId() == itemId) 
				{
					item.setQuantity(quantity); 
					itemsList.add(item);
				}
			}
			System.out.println("Do you want to continue to buy other items? Y/N");			
			if(sc.next().equalsIgnoreCase("Y")) 
			{
				continue;
			}
			else {break;} 
		}
		return itemsList;
	}

	@Override
	public boolean addToCart(List<Item> itemList) {
		OrderDao orderDao = DaoObjectFactory.getOrderDao();
		return orderDao.addToCart(itemList);
	}

	@Override
	public Order calculatePrice(List<Item> cartItems) {
		Order order = new Order();
		double finalItemPriceWithDiscount = 0;
		double finalItemPrice=0;
		for (int i = 0; i < cartItems.size(); i++) 
		{
			Item item = (Item) cartItems.get(i);
			double itemPrice = item.getItemPrice();
			int discountPercentage = item.getDiscount();
			boolean onSale = item.isOnSale();
			int quantity = item.getQuantity();
			double totalPrice = itemPrice * quantity;
			if (onSale) 
			{
				double discount = (totalPrice * discountPercentage) / 100;
				finalItemPriceWithDiscount = totalPrice - discount;
				//System.out.println("Final price: " + finalItemPriceWithDiscount);
			} else 
			{
				finalItemPriceWithDiscount = totalPrice;
			}
			finalItemPrice += finalItemPriceWithDiscount;
		}
		Random rand = new Random();
		int orderId = rand.nextInt(50);
		order.setOrderId(orderId);
		order.setItems(cartItems);
		order.setTotalPrice(finalItemPrice);
		return order;
	}

	@Override
	public boolean insertOrder(Order order) {
		OrderDao orderDao = DaoObjectFactory.getOrderDao();
		return orderDao.insertOrder(order);
	}

	@Override
	public boolean clearCartItems() {
		OrderDao orderDao = DaoObjectFactory.getOrderDao();
		return orderDao.clearCartItems();
	}

	@Override
	public Order getOrderByOrderId(Long orderId) {
		OrderDao orderDao = DaoObjectFactory.getOrderDao();
		Order order = orderDao.getOrderByOrderId(orderId);
		return order;
	}

	@Override
	public boolean deleteOrder(Long orderId) {
		OrderDao orderDao = DaoObjectFactory.getOrderDao();
		return orderDao.deleteOrder(orderId);
	}

}

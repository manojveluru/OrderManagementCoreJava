package com.training.ordmgmtprjcorejava.service;

import java.util.List;

import com.training.ordmgmtprjcorejava.model.Item;
import com.training.ordmgmtprjcorejava.model.Order;

public interface OrderService {
	
	public abstract List<Item> getCartItems();
	
	public abstract  List<Item> getItemsSelected(List<Item> itemList);
	
	public abstract  boolean addToCart(List<Item> itemList);
	
	public abstract  Order calculatePrice(List<Item> cartItems);
	
	public abstract  boolean insertOrder(Order order);
	
	public abstract  boolean clearCartItems();
	
	public abstract  Order getOrderByOrderId(Long orderId);
	
	public abstract  boolean deleteOrder(Long orderId);

}

package com.training.ordmgmtprjcorejava.dao;

import java.util.List;

import com.training.ordmgmtprjcorejava.model.Item;
import com.training.ordmgmtprjcorejava.model.Order;


public interface OrderDao {

	public abstract  List<Item> getCartItems();  
	
	public abstract  boolean addToCart(List<Item> itemList);
	
	public abstract  boolean insertOrder(Order order);
	
	public abstract  boolean clearCartItems();
	
	public abstract  Order getOrderByOrderId(Long orderId);
	
	public abstract  boolean deleteOrder(Long orderId);
}

package com.training.ordmgmtprjcorejava.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.training.ordmgmtprjcorejava.datastore.OrderDataStore;
import com.training.ordmgmtprjcorejava.model.Item;
import com.training.ordmgmtprjcorejava.model.Order;

public class OrderDaoImpl implements OrderDao{

	@Override
	public List<Item> getCartItems() {
		
		return OrderDataStore.getCartItems();
	}

	@Override
	public boolean addToCart(List<Item> itemList) {
		List<Item> cartItems = new ArrayList<>();
		for(int i=0;i<itemList.size();i++) 
		{
			cartItems.add(itemList.get(i));
		}
		OrderDataStore.setCartItems(cartItems);
		return true;
	}

	@Override
	public boolean insertOrder(Order order) {
		Map<Long,Order> insert = new HashMap<Long,Order>();
		List<Item> orderList = order.getItems();
		for(int i=0;i<orderList.size();i++) 
		{
			insert.put(order.getOrderId(), order);
		} 
		OrderDataStore.setOrderIdOrderObjMap(insert);
		return true;
	}

	@Override
	public boolean clearCartItems() {
		OrderDataStore.getCartItems().clear();
		return true;
	}

	@Override
	public Order getOrderByOrderId(Long orderId) {
		Map<Long,Order> orderDetails = OrderDataStore.getOrderIdOrderObjMap();
		Order order = orderDetails.get(orderId);
		return order;
	}

	@Override
	public boolean deleteOrder(Long orderId) {
		Map<Long,Order> orderDetails = OrderDataStore.getOrderIdOrderObjMap();
		orderDetails.remove(orderId);
		return true;
	}

}

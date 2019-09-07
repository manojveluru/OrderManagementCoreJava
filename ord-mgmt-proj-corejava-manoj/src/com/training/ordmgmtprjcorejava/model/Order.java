package com.training.ordmgmtprjcorejava.model;

import java.util.List;

public class Order {
	
	private long orderId ;
	private List<Item> items;
	private double totalPrice;
	
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", items=" + items + ", totalPrice=" + totalPrice + "]";
	}
	
}

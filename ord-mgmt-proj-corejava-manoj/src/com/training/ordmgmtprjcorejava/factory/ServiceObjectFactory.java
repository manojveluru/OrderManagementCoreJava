package com.training.ordmgmtprjcorejava.factory;

import com.training.ordmgmtprjcorejava.service.ItemService;
import com.training.ordmgmtprjcorejava.service.ItemServiceImpl;
import com.training.ordmgmtprjcorejava.service.OrderService;
import com.training.ordmgmtprjcorejava.service.OrderServiceImpl;

public class ServiceObjectFactory {
	
	public static ItemService getItemService() 
	{
		ItemService itemService = new ItemServiceImpl();
		return itemService;
	}

	public static OrderService getOrderService() 
	{
		OrderService orderService = new OrderServiceImpl();
		return orderService;
	}
}

package com.training.ordmgmtprjcorejava.factory;

import com.training.ordmgmtprjcorejava.dao.ItemDao;
import com.training.ordmgmtprjcorejava.dao.ItemDaoImpl;
import com.training.ordmgmtprjcorejava.dao.OrderDao;
import com.training.ordmgmtprjcorejava.dao.OrderDaoImpl;

public class DaoObjectFactory {
	
	public static ItemDao getItemDao() 
	{
		ItemDao itemDao = new ItemDaoImpl();
		return itemDao;
	}

	public static OrderDao getOrderDao() 
	{
		OrderDao orderDao = new OrderDaoImpl();
		return orderDao;
	}
}

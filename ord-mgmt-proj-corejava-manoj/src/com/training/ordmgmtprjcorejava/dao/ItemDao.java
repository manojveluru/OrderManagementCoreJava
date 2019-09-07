package com.training.ordmgmtprjcorejava.dao;

import java.util.List;

import com.training.ordmgmtprjcorejava.model.Item;

public interface ItemDao {

	public abstract List<Item> searchItemsByKeyword(String keyword);
}

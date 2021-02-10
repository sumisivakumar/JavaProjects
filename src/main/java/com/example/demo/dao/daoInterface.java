package com.example.demo.dao;

import java.util.List;

import com.example.demo.dto.orders;

public interface daoInterface {
	
	public List getOrders();
	
	public void addOrders(orders order);
	
	public void deleteOrder(orders order);
	
	public void updateOrder(orders order);

}

package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.orders;

public interface serviceInterface {
	
	public List getOrders();
	
	public void addOrders(orders order);
	
	public void deleteOrder(orders order);
	
	public void updateOrder(orders order);

}

package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.bookDao;
import com.example.demo.dao.daoInterface;
import com.example.demo.dto.orders;


@Service
public class bookService implements serviceInterface{
	
	@Autowired
	private daoInterface books; 
	
	
	public List getOrders() {
		List<orders> List = books.getOrders();
		return List;
	}
	
	public void addOrders(orders order) {
		books.addOrders(order);
	}

	public void deleteOrder(orders order) {
		books.deleteOrder(order);	
	}

	public void updateOrder(orders order) {
		books.updateOrder(order);
	}
	

}

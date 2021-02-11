 package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.orders;
import com.example.demo.entity.response;
import com.example.demo.service.bookService;
import com.example.demo.service.serviceInterface;

@Controller
@RestController
@RequestMapping("/employee")
public class bookController {
	
	@Autowired
	private serviceInterface service;
	
	@RequestMapping(value = "/firstTime ")
	public ResponseEntity<response> methodOne() {
		response res = new response();
		res.setName("Testing the Controller");
		System.out.println("Controller Testing");
		return new ResponseEntity<>(res, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/firstParam")
	public ResponseEntity<response> method(@RequestParam int num) {
		response resp = new response();
		resp.setNumber(num);
		System.out.println("The number is: " +num);
		return new ResponseEntity<>(resp, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/orders")
	public List<orders> getOrders() {
	 List<orders> orders = service.getOrders();
		return orders;
	}
	
	@RequestMapping(value = "/add")
	public void addOrders(@RequestBody orders order) {
		service.addOrders(order);
		System.out.println("Successfully inserted");
	}
	
	@RequestMapping(value = "/delete")
	public void deleteOrder(@RequestBody orders order) {
		service.deleteOrder(order);
		System.out.println("Successfully Deleted !!");
	}
	
	@RequestMapping(value = "/update")
	public void updateOrder(@RequestBody orders order) {
		service.updateOrder(order);
		System.out.println("Records updated Sucessfully");
	}
	
	
	
}

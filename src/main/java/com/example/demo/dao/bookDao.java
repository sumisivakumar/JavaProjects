package com.example.demo.dao;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.OrderRowMapper;
import com.example.demo.dto.orders;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

@Transactional
@Repository
public class bookDao implements daoInterface{
	

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public List<orders> getOrders() {
		String query = "SELECT * from orders";
		RowMapper<orders> rowMapper = new OrderRowMapper();
		List<orders> list = jdbcTemplate.query(query, rowMapper);

		return list;
		}
	
	public void addOrders(orders order) {
		String query = "insert into orders (id,name,status) values (?,?,?)";
		jdbcTemplate.update(query, order.getId(), order.getName(), order.getStatus());
	}
	
	public void deleteOrder(orders order) {
		String query = "delete from orders where id = ?";
		jdbcTemplate.update(query,order.getId());
	}
	
	public void updateOrder(orders order) {
		String query = "update orders SET status = '2' where id = ?";
		jdbcTemplate.update(query, order.getId());
	}

}

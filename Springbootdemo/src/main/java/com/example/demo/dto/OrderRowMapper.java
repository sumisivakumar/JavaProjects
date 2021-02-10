package com.example.demo.dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class OrderRowMapper implements RowMapper<orders>
{
	
	@Override
	public orders mapRow(ResultSet rs, int rowNum) throws SQLException {
	orders orders = new orders();
	orders.setId(rs.getInt("id"));
	orders.setName(rs.getString("name"));
	orders.setStatus(rs.getInt("status"));
	return orders;
	}
	
}

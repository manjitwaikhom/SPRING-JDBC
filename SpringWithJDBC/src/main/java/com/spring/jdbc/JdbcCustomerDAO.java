package com.spring.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcCustomerDAO implements CustomerDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void addCustomer(CustomerTO cto) {
		String sql="insert into customers values(?,?,?,?,?)";
		Object args[]= {cto.getCid(),cto.getCname(),cto.getEmail(),cto.getPhone(),cto.getCity()};
		jdbcTemplate.update(sql, args);
	}

	@Override
	public void updateCustomer(CustomerTO cto) {
		String sql="update customers set cname=?,email=?,phone=?,city=? where cid=?";
		Object args[]= {cto.getCid(),cto.getCname(),cto.getEmail(),cto.getPhone(),cto.getCity()};
		jdbcTemplate.update(sql, args);

	}

	@Override
	public void deleteCustomer(int cid) {
		String sql="delete from  customers  where cid=?";
		Object args[]= {cid};
		jdbcTemplate.update(sql, args);

	}

}

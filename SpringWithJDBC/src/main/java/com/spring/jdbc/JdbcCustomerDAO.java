package com.spring.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcCustomerDAO implements CustomerDAO {
	
	@Autowired
	JdbcTemplate jdbcTemp;

	@Override
	public void addCustomer(CustomerTO cto) {
		String sql="insert into CUSTOMER values(?,?,?,?,?)";
		Object args[]= {cto.getCid(),cto.getCname(),cto.getEmail(),cto.getPhone(),cto.getCity()};
		int i=jdbcTemp.update(sql, args);
		System.out.println(i);
	}

	@Override
	public void updateCustomer(CustomerTO cto) {
		String sql="update CUSTOMER set cname=?,email=?,phone=?,city=? where cid=?";
		Object args[]= {cto.getCid(),cto.getCname(),cto.getEmail(),cto.getPhone(),cto.getCity()};
		int i=jdbcTemp.update(sql, args);
		System.out.println(i);

	}

	@Override
	public void deleteCustomer(int cid) {
		String sql="delete from  CUSTOMER  where cid=?";
		Object args[]= {cid};
		jdbcTemp.update(sql, args);

	}

}

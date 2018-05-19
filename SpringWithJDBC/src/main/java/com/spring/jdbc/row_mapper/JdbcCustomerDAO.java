
package com.spring.jdbc.row_mapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author manjit
 *
 */
public class JdbcCustomerDAO implements CustomerDAO {
	
	@Autowired
	JdbcTemplate jdbcTemp;

	@Override
	public List<CustomerTO> getAllCustomers() {
		String sql="select * from customers";
		List list=jdbcTemp.query(sql, new CustomerRowMapper());
		return list;
	}

	@Override
	public CustomerTO getCustomerByCid(int cid) {
		String sql="select * from customers where cid=?";
		Object args[]= {cid};
		CustomerTO cto=(CustomerTO)jdbcTemp.queryForObject(sql, args,new CustomerRowMapper());
		return cto;
	}


	@Override
	public List<CustomerTO> getCustomersByCity(String city) {
		String sql="select * from customers where city=?";
		Object args[]= {city};
		List list=jdbcTemp.query(sql, args,new CustomerRowMapper());
		return list;
	}

	
	@Override
	public int getCustomerCount() {
		String sql="select count(*) from customers";
		Object args[]= {null};
		Integer count=jdbcTemp.queryForObject(sql, args, Integer.class);
		return count.intValue();
	}

	
	@Override
	public Long getCustomerPhoneByEmail(String email) {
		String sql="select phone from customers where email=?";
		Object args[]= {email};
		Long phone=jdbcTemp.queryForObject(sql, args, Long.class);
		return phone;
	}

	
	
	@Override
	public String getCustomerCityByEmail(String email) {
		String sql="select city from customers where email=?";
		Object args[]= {email};
		String city=jdbcTemp.queryForObject(sql, args, String.class);
		return city;
	}

	@Override
	public CustomerTO getCustomerByEmail(String email) {
		String sql="select * from customers where email=?";
		Object args[]= {email};
		CustomerTO cto=(CustomerTO)jdbcTemp.queryForObject(sql, args,new  CustomerRowMapper());
		return cto;
	}

}

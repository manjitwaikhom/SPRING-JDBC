package com.spring.jdbc.row_mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

/**
 * @author manjit
 *
 */
public class CustomerRowMapper implements RowMapper<CustomerTO>{

	/* (non-Javadoc)
	 * @see org.springframework.jdbc.core.RowMapper#mapRow(java.sql.ResultSet, int)
	 */
	@Override
	public CustomerTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		CustomerTO cto=new CustomerTO();
		cto.setCid(rs.getInt(1));
		cto.setCname(rs.getString(2));
		cto.setEmail(rs.getString(3));
		cto.setPhone(rs.getLong(4));
		cto.setCity(rs.getString(5));
		
		return cto;
	}

}

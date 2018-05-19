package com.spring.jdbc.simple_jdbc_template;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author manjit
 *
 */
public class JdbcCustomerDAO implements CustomerDAO{

	@Autowired
	//SimpleJdbcTemplate simplejdbcTemplate ;
	
	/*As of Spring 3.1 SimpleJdbcTemplate has been deprecated, and most of the features of
	SimpleJdbcTemplate have been integrated into JdbcTemplate, except named parameter which 
	is provided by NamedParameterJdbcTemplate.
	The bottom line is, if you're using SimpleJdbcTemplate is perfectly fine, and there is no rush to upgrade, 
	but for new developments, you should use JdbcTemplate or NamedParameterJdbcTemplate.
*/
	@Override
	public void addCustomer(CustomerTO cto) {
		String sql="insert into customers values(?,?,?,?,?)";
		
		
	}


	@Override
	public void updateCustomer(CustomerTO cto) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteCustomer(int cid) {
		// TODO Auto-generated method stub
		
	}

}

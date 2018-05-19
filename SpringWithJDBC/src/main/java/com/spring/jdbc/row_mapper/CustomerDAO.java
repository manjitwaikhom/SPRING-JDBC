package com.spring.jdbc.row_mapper;

import java.util.List;



/**
 * @author manjit
 *
 */
public interface CustomerDAO {
	public List<CustomerTO> getAllCustomers();
	public CustomerTO getCustomerByCid(int cid);
	public CustomerTO getCustomerByEmail(String email);
	public List<CustomerTO> getCustomersByCity(String city);
	public int getCustomerCount();
	public String getCustomerCityByEmail(String email);
	public Long getCustomerPhoneByEmail(String email);
}

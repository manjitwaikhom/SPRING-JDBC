package com.spring.jdbc.simple_jdbc_template;

public interface CustomerDAO {
public void addCustomer(CustomerTO cto);
public void updateCustomer(CustomerTO cto);
public void deleteCustomer(int cid);
}

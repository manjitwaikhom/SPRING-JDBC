
package com.spring.jdbc.row_mapper;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author manjit
 *
 */
public class Lab42 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/jdbc/row_mapper/applicationContext.xml");
		CustomerDAO cdao = (CustomerDAO) ctx.getBean("cdao");

		// 1. getCustomerByCid
		System.out.println("get customers by cid");
		CustomerTO cto = cdao.getCustomerByCid(6);
		System.out.println(cto);

		// getAllCustomers
		System.out.println("get  all customers");
		List<CustomerTO> list = cdao.getAllCustomers();
		System.out.println(list);

		// get Customers by email
		System.out.println("get  customers by email");
		CustomerTO ctoe = cdao.getCustomerByEmail("manjit@waikhom.in");
		System.out.println(ctoe);

		// get Customers by city
		System.out.println("get  customers by city");
		List<CustomerTO> ctoc = cdao.getCustomersByCity("Imphal");
		System.out.println(ctoc);

		// get Customers count
		/*System.out.println("get  customers count");
		int count = cdao.getCustomerCount();
		System.out.println(count);
*/
		// get Customers city by email
		System.out.println("get  Customer City By Email");
		String citye= cdao.getCustomerCityByEmail("joe@gmail.com");
		System.out.println(citye);
		
		
		// get Customers phone by email
		System.out.println("get  Customer phone By Email");
		long phone= cdao.getCustomerPhoneByEmail("mon@gmail.com");
		System.out.println(phone);


	}

}

package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab41 {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/spring/jdbc/applicationContext.xml");
		CustomerDAO cdao=(CustomerDAO)ctx.getBean("cdao");
		
		//add customer
		CustomerTO cto=new CustomerTO(1,"victoria",95602911,"vicbee@atkpm.com","Imphal");
		cdao.addCustomer(cto);

	}

}

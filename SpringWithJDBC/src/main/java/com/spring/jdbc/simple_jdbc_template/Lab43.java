package com.spring.jdbc.simple_jdbc_template;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab43 {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/spring/jdbc/simple_jdbc_template/applicationContext.xml");
		CustomerDAO cdao=(CustomerDAO)ctx.getBean("cdao");
	
		//add customer
		CustomerTO cto0=new CustomerTO(0,"Victoria",956029113,"vicbee@atkpm.com","Imphal");
		CustomerTO cto1=new CustomerTO(1,"Manjit",997231764,"manjit@waikhom.in","Imphal");
		CustomerTO cto2=new CustomerTO(2,"Waikhom",906069267,"manjit@gmail.com","Imphal");
		CustomerTO cto3=new CustomerTO(3,"Athokpam",999999999,"athokpam@waikhom.com","Imphal");
		CustomerTO cto4=new CustomerTO(4,"Jimmy",888888888,"jimmy@outlook.com","New york");
		CustomerTO cto5=new CustomerTO(5,"Joe",777777777,"joe@gmail.com","London");
		CustomerTO cto6=new CustomerTO(6,"Aldrin",666666666,"aldrin@ayahoo.com","Paris");
		CustomerTO cto7=new CustomerTO(7,"phoebe",555555555,"phoe@gmail.com","Connecticut");
		CustomerTO cto8=new CustomerTO(8,"Joey",444444444,"vicbee@atkpm.com","Washington");
		CustomerTO cto9=new CustomerTO(9,"Monica",333333333,"mon@gmail.com","Texas");
		
		cdao.addCustomer(cto1);
		cdao.addCustomer(cto2);
		cdao.addCustomer(cto3);
		cdao.addCustomer(cto4);
		cdao.addCustomer(cto5);
		cdao.addCustomer(cto6);
		cdao.addCustomer(cto7);
		cdao.addCustomer(cto8);
		cdao.addCustomer(cto9);
		

	}

}

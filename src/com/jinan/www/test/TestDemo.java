package com.jinan.www.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jinan.www.bean.User;

public class TestDemo {
	
	@Test
	public void fun1() {
		//������������
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//��������Ҫ����
		User user =(User) applicationContext.getBean("user");
		//��ӡuser����
		System.out.println(user);
	}

}

package com.jinan.www.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jinan.www.bean.User;

public class TestDemo {
	
	@Test
	public void fun1() {
		//创建容器对象
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//向容器索要对象
		User user =(User) applicationContext.getBean("user");
		//打印user对象
		System.out.println(user);
	}

}

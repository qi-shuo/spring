package com.qis.edu;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author qishuo1
 * @create 2021/2/9 18:35
 */
@Component("testConfig")
public class TestConfig {
	@Autowired
	private TestAutowired testAutowired;

	public void aop() {
		System.out.println("打印");
	}

	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:applicationConfig.xml");
		TestConfig testConfig = (TestConfig) classPathXmlApplicationContext.getBean("testConfig");
		testConfig.aop();
		TestConfig testConfig1 = (TestConfig) classPathXmlApplicationContext.getBean("testConfig");

		System.out.println(testConfig1);
		System.out.println(testConfig.toString());
		System.out.println(testConfig1.equals(testConfig));
	}

	@Test
	public void testConfig() {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:applicationConfig.xml");
		TestConfig testConfig = (TestConfig) classPathXmlApplicationContext.getBean("testConfig");
		//testAutowired.test();
	}
}

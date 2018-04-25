package com.gc.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class ApplicationTest {
	public static void main(String[] args) {
		/*ApplicationContext app=new ClassPathXmlApplicationContext("compliex.xml");
		Teacher tec=app.getBean("tec", Teacher.class);
		*/
		
		ClassPathResource cpr=new ClassPathResource("compliex.xml");
		DefaultListableBeanFactory bf=new DefaultListableBeanFactory();
		
		((DefaultListableBeanFactory)bf).setAllowBeanDefinitionOverriding(false);
		Teacher tec=bf.getBean("tec", Teacher.class);
		System.out.println(tec);
	}
}

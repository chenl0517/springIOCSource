package com.gc.test;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
/**
 * implements InitializingBean,ApplicationContextAware
 * @author root1
 *
 */
public class Student {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("我日你mmp...............");
		
	}
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		System.out.println("================"+applicationContext);
		
	}
	
	

}

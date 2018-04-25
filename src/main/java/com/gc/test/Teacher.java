package com.gc.test;

import org.springframework.beans.factory.annotation.Autowired;

public class Teacher {
	
	//@Autowired
	private Student stu;
	public void setStu(Student stu) {
		this.stu = stu;
	}
	
	public void say(){
		System.out.println("======================"+stu);
		
	}

}

package com.gc.pojo;

import java.util.Date;

public class User {
	private int id;
	
	//private Date birthDate;
	
	public User() {
		System.out.println("=================User=================");
	}
	
	private String name;
	
	private Teacher user;
	

	public Teacher getUser() {
		return user;
	}

	public void setUser(Teacher user) {
		this.user = user;
	}

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
	
	

}

package com.learning.oops.inheritance.exercise;

public class Person {

	private String name;
	private String phone;
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Person(String name, String phone, String email) {
		super();
		this.name = name;
		
		
		this.phone = phone;
		this.email = email;
	}
	
	
	
}

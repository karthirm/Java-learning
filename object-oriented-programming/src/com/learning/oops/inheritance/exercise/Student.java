package com.learning.oops.inheritance.exercise;

public class Student extends Person {
	
	public Student(String name, String phone, String email) {
		super(name, phone, email);
		// TODO Auto-generated constructor stub
	}
	private String college;
	private int year;
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	

}

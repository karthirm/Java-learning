package com.learning.oops.inheritance.exercise;

import java.math.BigDecimal;

public class Employee extends Person {
	public Employee(String name, String phone, String email) {
		super(name, phone, email);
		// TODO Auto-generated constructor stub
	}
	private String title;
	private String employer;
	private String employeeGrade;
	private BigDecimal salary;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEmployer() {
		return employer;
	}
	public void setEmployer(String employer) {
		this.employer = employer;
	}
	public String getEmployeeGrade() {
		return employeeGrade;
	}
	public void setEmployeeGrade(String employeeGrade) {
		this.employeeGrade = employeeGrade;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [title=" + title + ", employer=" + employer + ", employeeGrade=" + employeeGrade + ", salary="
				+ salary + ", getName()=" + getName() + ", getPhone()=" + getPhone() + ", getEmail()=" + getEmail()
				+ ", toString()=" + super.toString() + "]";
	}
	
}

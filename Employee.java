package com.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Employee {
	
	@Id
	private long phoneno;
	private String employeename;
	@Id
	private int age;
	

	// Getter and Setter
	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	// No argument constructor
	public Employee() {
	}

	// Argument Constructor
	public Employee(String employeename, int age, long phoneno) {
		super();
		this.employeename = employeename;
		this.age = age;
		this.phoneno = phoneno;
	}

	// TO String method
	@Override
	public String toString() {
		return "Employee [employeename=" + employeename + ", age=" + age + ", phoneno=" + phoneno + "]";
	}

}

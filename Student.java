package com.Xyz;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Student {
	
	@Id
	private int age;
	private String stdname;
	
	//Getter and Setter method
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	
	//parameterized Constructor
	public Student(int age, String stdname) {
		super();
		this.age = age;
		this.stdname = stdname;
	}
	
	// NO Argument Constructor
	public Student() {
		
	}
	
	//ToString Method
	@Override
	public String toString() {
		return "Student [age=" + age + ", stdname=" + stdname + "]";
	}
	
	
	
	
	
	
	
	

}

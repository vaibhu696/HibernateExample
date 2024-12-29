package com.vehicle;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Vehicle {
	
	@Id
	private int id;
	private String name;
	private String type;
	
	//Getter and Setter method
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	// no argument constructor
	public Vehicle() {
		
	}
	
	// Argument Constructor
	public Vehicle(int id, String name, String type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
	}
	  
	//toString method
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", name=" + name + ", type=" + type + "]";
	}
	
	
	
	
	
	

}

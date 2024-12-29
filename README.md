# HibernateExample

# Employee Example1
"Added Employee entity and Hibernate integration for data insertion"

# Description:

Created an Employee entity class annotated with @Entity for Hibernate ORM.
Configured Hibernate to map the Employee class to a database table.
Implemented MainEmployee to save an Employee object into the database using Hibernate.

# CODE
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
 # main method
package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainEmployee {
	public static void main(String[] args) {
	
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml") ;
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		Employee e= new Employee("vaibhavi",21,15324878);
		ss.save(e);
		tr.commit();
		ss.close();
		sf.close();
		
		System.out.println("inserted data..");
		
	}
}

# Department Example2
"Added Department entity and Hibernate integration for data insertion"

# Description:

Defined Department entity with @Entity annotation for Hibernate ORM.
Configured Hibernate mapping for Department to interact with the database.
Created Maindepartment class to demonstrate basic CRUD functionality:
Inserted a Department record into the database using Hibernate.
Included constructors, getters, setters, and a toString method in the Department class.

# Code

package com.department;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Department {

	@Id
	int deptid;
	String deptname;

	// getter and setter
	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	// toString
	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", deptname=" + deptname + "]";
	}

	// parameterized constructor
	public Department(int deptid, String deptname) {
		super();
		this.deptid = deptid;
		this.deptname = deptname;
	}

	// no argument
	public Department() {

	}

}

# main method

package com.department;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Maindepartment {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml") ;
		cfg.addAnnotatedClass(Department.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		Department d=new Department(1,"Hr department");
		
        ss.save(d);
		System.out.println(d);
		System.out.println("insered data...");
		
		tr.commit();
		ss.close();
		sf.close();
		
		
	}

}


# StudentExample3
"Added Student entity and Hibernate integration for data insertion"

# Description:

Created the Student entity class with @Entity annotation for Hibernate ORM.
Defined fields age (as primary key) and stdname with appropriate getters, setters, and constructors.
Implemented a MainStudent class to configure Hibernate and insert a Student record into the database.

# Code
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

# Main Method
package com.Xyz;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MainStudent {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml") ;
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
       Student s=new Student(19,"Vaibhavi Deshpande");
		
        ss.save(s);
		System.out.println(s);
		System.out.println("insered data...");
		
		tr.commit();
		ss.close();
		sf.close();
	}
}

# VehicleExample4:
"Added Vehicle entity and Hibernate integration for data insertion"

# Description:

Defined the Vehicle entity class with @Entity annotation for Hibernate ORM.
Configured fields id (primary key), name, and type with appropriate constructors, getters, setters, and a toString method.
Implemented MainVehicle to integrate Hibernate, configure database settings, and perform a basic Insert operation to save a Vehicle record into the database.
Showcased the use of parameterized constructors for initializing the Vehicle object.

# Code
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

# Main Method

package com.vehicle;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainVehicle {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml") ;
		cfg.addAnnotatedClass(Vehicle.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		Vehicle v=new Vehicle(1,"xyz","abc");
		ss.save(v);
		System.out.println(v);
		tr.commit();
		ss.close();
		sf.close();
		
		

	}

}


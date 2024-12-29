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

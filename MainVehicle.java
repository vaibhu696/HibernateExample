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

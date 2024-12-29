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

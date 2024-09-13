package com.excelr;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.excelr.model.Student;

public class GetDemo {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	Session session1=factory.openSession();
    	Transaction tx=session1.beginTransaction();
    	
    	Student s1=session1.get(Student.class,1);  //query db
    	System.out.println(s1);
    	
    	Student s2=session1.get(Student.class,1);  //query not
    	System.out.println(s2);
    	System.out.println(s1==s2);
    	
    	Student s3=session1.get(Student.class,2);   //query db
    	System.out.println(s3);
	}

}

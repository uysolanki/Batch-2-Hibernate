package com.excelr;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.excelr.model.Student;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	Session session1=factory.openSession();
    	Transaction tx=session1.beginTransaction();
    	
    	Student s1=new Student();
    	s1.setSname("Rohit");
    	s1.setPer(88.5);
    	
    	Student s2=new Student();
    	s2.setSname("Karan");
    	s2.setPer(98.5);
    	
    	Student s3=new Student();
    	s3.setSname("Arjun");
    	s3.setPer(89.5);
    	
    	Student s4=new Student();
    	s4.setSname("Alice");
    	s4.setPer(91.5);
    	
    	session1.save(s1);
    	session1.save(s2);
    	session1.save(s3);
    	session1.save(s4);
    	tx.commit();
    	
    	
    	session1.close();
    	factory.close();

    }
}

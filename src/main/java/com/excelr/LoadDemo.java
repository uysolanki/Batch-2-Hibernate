package com.excelr;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.excelr.model.Student;

public class LoadDemo {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	Session session1=factory.openSession();
    	Transaction tx=session1.beginTransaction();
    	
    	Student s1=session1.load(Student.class,1);    //rno=1 sname=null per=0.0
    	System.out.println("hi");				//hi
    	System.out.println(s1.getRno());		//1
    	System.out.println("bye");				//bye
    	System.out.println(s1.getPer());		//select query
    											//88.5
    	
    	Student s2=session1.load(Student.class,1);
    	System.out.println(s2.getSname());
	}

}

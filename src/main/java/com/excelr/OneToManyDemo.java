package com.excelr;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.excelr.model.Dept;
import com.excelr.model.Employee;

public class OneToManyDemo {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	Session session1=factory.openSession();
    	Transaction tx=session1.beginTransaction();
    	
    	Dept d1=new Dept();
    	d1.setDname("IT");
    	d1.setCity("Pune");
    	
    	Dept d2=new Dept();
    	d2.setDname("HR");
    	d2.setCity("Delhi");
    	
    	
    	Employee e1=new Employee();
    	e1.setEname("Alice");
    	e1.setSal(800);
    	e1.setMyDept(d1);
    	
    	Employee e2=new Employee();
    	e2.setEname("Ben");
    	e2.setSal(900);
    	e2.setMyDept(d1);
    	
    	Employee e3=new Employee();
    	e3.setEname("Chris");
    	e3.setSal(300);
    	e3.setMyDept(d2);
    	
    	Employee e4=new Employee();
    	e4.setEname("David");
    	e4.setSal(350);
    	e4.setMyDept(d2);
    	
    	List<Employee> ItEmps = new ArrayList();
    	ItEmps.add(e1);
    	ItEmps.add(e2);
    	
    	List<Employee> HrEmps = new ArrayList();
    	HrEmps.add(e3);
    	HrEmps.add(e4);
    	
    	d1.setDeptEmps(ItEmps);
    	d2.setDeptEmps(HrEmps);
    	
    	session1.save(e1);
    	session1.save(e2);
    	session1.save(e3);
    	session1.save(e4);
    	
    	session1.save(d1);
    	session1.save(d2);
    	
    	tx.commit();
    	session1.close();
    	factory.close();
    	

	}

}

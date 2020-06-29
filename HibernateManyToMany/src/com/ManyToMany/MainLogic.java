package com.ManyToMany;


import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainLogic {
	public static void main(String args[]) {
	
		Configuration cf = new Configuration();
		cf.configure("Configure.xml");
		SessionFactory sf = cf.buildSessionFactory();
		Session se = sf.openSession();
		
		Transaction tx = se.beginTransaction();
		
		Students s= new Students();
		s.setSid(1);
		s.setSname("Bikram");
		s.setSmark(85);
		
		Students s1= new Students();
		s1.setSid(2);
		s1.setSname("Bikrant");
		s1.setSmark(95);
		
		Course c = new Course();
		c.setCid(123);
		c.setCname("Physics");
		c.setCduration(100);
		
		Course c1 = new Course();
		c1.setCid(111);
		c1.setCname("Economics");
		c1.setCduration(95);
		
		Set a = new HashSet();
		a.add(c1);
		a.add(c);
		
		
		s.setCourse(a);
		s1.setCourse(a);
		
		se.save(s);
		se.save(s1);
		
		tx.commit();
		
		se.close();
		sf.close();
		
		
	}
}

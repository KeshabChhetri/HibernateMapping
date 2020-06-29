package com.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class MainLogic {
	public static void main (String[] args) {
		 
		Configuration cf =  new Configuration();
		cf.configure("configure.xml");
		SessionFactory sf = cf.buildSessionFactory();
		Session se = sf.openSession();
		
		
		Player p = new Player();
		p.setPid(111);
		p.setPname("Sunil Chhetri");
		p.setPgoal(72);
		
		Details d = new Details();
		d.setId(1);
		d.setCity("Banglore");
		d.setState("Karnataka");
		d.setCountry("India");
		d.setP(p);
		
		Transaction tx = se.beginTransaction();
		
		se.save(d);
		tx.commit();
		
		se.close();
		sf.close();
	
		
	}

}

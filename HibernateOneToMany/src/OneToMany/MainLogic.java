package OneToMany;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainLogic {
	public static void main (String args[]) {
		
		Configuration cf = new Configuration();
		cf.configure("Configure.xml");
		SessionFactory sf = cf.buildSessionFactory();
		Session se = sf.openSession();
		
		/*
		Object o =se.get(Location.class, 1);
		Location l = (Location)o;
		System.out.println(l.getLid()+" "+l.getLcountry());
		//System.out.println(l.getLcountry());
		 
		 */
		
		
		
		
		Transaction tx = se. beginTransaction();
		Location l = new Location();
		l.setLid(1);
		l.setLcountry("Nepal");
		
		Mountains m = new Mountains();
		m.setMid(100);
		m.setMname("Mount Everest");
		m.setMheight(8848);
		
		Mountains m1 = new Mountains();
		m1.setMid(101);
		m1.setMname("Mount Manaslu");
		m1.setMheight(8156);
		
		Mountains m2 = new Mountains();
		m2.setMid(102);
		m2.setMname("Mount Dhaulagiri");
		m2.setMheight(8167);
		
		/*
		
		List a = new ArrayList();
		a.add(m);
		a.add(m1);
		a.add(m2);
		l.setN(a);
		
		*/
		
		Map n = new HashMap();
		n.put("Mountain1",m);
		n.put("Mountain2",m1);
		n.put("Mountain3",m2);
		se.save(l);
		
		l.setN(n);
		
		
		/*
		Iterator li = x.iterator();
		while(li.hasNext()) {
			Object k = (Object)li.next();
			Mountains m =(Mountains)k;
			System.out.println(m.getMid()+" "+m.getMname()+" "+m.getFKid());
		}
		
		*/
		
		
		
		
		//x.add(m);
		//x.add(m1);
		//x.add(m2);
		
//		l.setN(x);
	//	se.save(l);
		tx.commit();
		
		se.close();
		sf.close();
		
	}

}

package com.techment;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alien a=new Alien();
		a.setAid(1);
		a.setAname("nishi");
		a.setColor("green");
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
       //ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory();
		
		Session session1 = sf.openSession();
//		session1.beginTransaction();
//		a=(Alien) session1.get(Alien.class, 1);
//		session1.getTransaction().commit();
//		session1.close();
		
		org.hibernate.Transaction tx = session1.beginTransaction();
		session1.save(a);
		tx.commit();
		
				
				
				
				
				

	}

}

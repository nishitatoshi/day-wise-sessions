package com.techment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory= configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		Student employee=new Student();
		employee.setStudentId(1);
		employee.setName("Nishita");
		employee.setDept("Developer");
		
		session.persist(employee);
		System.out.println("Inserted");
		tx.commit();
	}

}
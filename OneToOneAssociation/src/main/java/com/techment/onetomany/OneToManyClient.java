package com.techment.onetomany;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToManyClient {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory( "techment" );  
        EntityManager em = emf.createEntityManager( );  
        em.getTransaction().begin();
        
        Employees e1 = new Employees("hari", "developer");
        Employees e2 = new Employees("manoj", "hr");
        
        //to store in database
        em.persist(e1);
        em.persist(e2);
        
        List<Employees> employees = new ArrayList<Employees>();
        employees.add(e1);
        employees.add(e2);
        
        Department d1 = new Department();
        d1.setName("hr");
        d1.setEmployees(employees);
        
        em.persist(d1);

       System.out.println("======inserted=====");
        
        em.getTransaction().commit();
	}

}

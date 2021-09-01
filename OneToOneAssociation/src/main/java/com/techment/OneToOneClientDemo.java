package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneClientDemo {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory( "techment" );  
        EntityManager em = emf.createEntityManager( );  
        em.getTransaction().begin();
        
        Address address = new Address();
        address.setDoorNo(1002);
        address.setStreetName("mayapur");
        address.setCity("Ambikapur");
        
        Employee employee = new Employee();
        employee.setId(2);
        employee.setName("kumar");
        employee.setDesignation("developer");
        employee.setAddress(address);
        
        em.persist(address);
        em.persist(employee);
        
        System.out.println("======inserted=====");
        
        em.getTransaction().commit();
	}

}

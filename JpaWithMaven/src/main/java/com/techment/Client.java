package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Product product = new Product();
		product.setId(1);
		product.setName("Galaxy Grand prime");
		product.setCategory("smart Phone");
		product.setPrice(18500);
		
		em.persist(product);
		em.getTransaction().commit();
	
		

	}

}
package com.manytoone;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManyToOneClientDemo {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory( "techment" );  
        EntityManager em = emf.createEntityManager( );  
        em.getTransaction().begin();
        
        List<Coursee> coursess = new ArrayList<Coursee>();
        
       
       Studentt sachin1 = new Studentt();
       sachin1.setId(1);
       sachin1.setName("sachin1");
//       sachin.setCourse(courses);

       Studentt sachin2 = new Studentt();
       sachin2.setId(2);
       sachin2.setName("sachin2");
       
       Studentt sachin3 = new Studentt();
       sachin3.setId(3);
       sachin3.setName("sachin3");
       
       em.persist(sachin1);
       em.persist(sachin2);
       em.persist(sachin3);

       
       Coursee java = new Coursee(90, "java", 4);
      

       coursess.add(java);
        
       em.persist(java);
         
       System.out.println("======inserted=====");
        
        em.getTransaction().commit();
	}

}

package com.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToManyClientDemo {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory( "techment" );  
        EntityManager em = emf.createEntityManager( );  
        em.getTransaction().begin();
        
       Course java = new Course(90, "java", 4);
       Course python = new Course(91, "python", 3);
       Course bigData = new Course(92, "Big Data", 4);

       List<Course> courses = new ArrayList<Course>();
       courses.add(java);
       courses.add(python);
       courses.add(bigData);

       em.persist(java);
       em.persist(python);
       em.persist(bigData);
       
       Student sachin = new Student();
       sachin.setId(1);
       sachin.setName("sachin");
       sachin.setCourse(courses);
       
       em.persist(sachin);
       
       System.out.println("======inserted=====");
        
        em.getTransaction().commit();
	}

}

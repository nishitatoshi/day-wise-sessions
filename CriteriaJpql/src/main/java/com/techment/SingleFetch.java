package com.techment;

import javax.persistence.*;  
import javax.persistence.criteria.*;  
  
import java.util.*;  
public class SingleFetch {  
      
      
    public static void main( String args[]) {  
             
           
         EntityManagerFactory emf = Persistence.createEntityManagerFactory( "techment" );  
          EntityManager em = emf.createEntityManager();  
          em.getTransaction().begin( );  
          CriteriaBuilder cb=em.getCriteriaBuilder();  
          CriteriaQuery<StudentEntity> cq=cb.createQuery(StudentEntity.class);  
            
         Root<StudentEntity> stud=cq.from(StudentEntity.class);  
           
         cq.multiselect(stud.get("name"));   
           
          CriteriaQuery<StudentEntity> select = cq.select(stud);  
          TypedQuery<StudentEntity> q = em.createQuery(select);  
          List<StudentEntity> list = q.getResultList();  
  
          System.out.println("studentId");  
               
            
          for(StudentEntity s:list)  
          {  
          System.out.println(s.getStudentId());  
      
        }  
            
em.getTransaction().commit();  
          em.close();  
          emf.close();    
     }  
}  
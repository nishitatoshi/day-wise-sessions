package com.techment;

import javax.persistence.*;  

  
import java.util.*;  
public class FetchColumn {  
      
     public static void main( String args[]) {  
             
          EntityManagerFactory emf = Persistence.createEntityManagerFactory( "techment" );  
          EntityManager em = emf.createEntityManager();  
          em.getTransaction().begin( );  
                    
          Query query = em.createNamedQuery("find name");  
          @SuppressWarnings("unchecked")  
        List<StudentEntity> list =query.getResultList();  
          System.out.println("Student Name :");  
          for(StudentEntity s:list) {  
                
             System.out.println(s.getName());  
          
               
          }  
            
        
          em.close();  
          emf.close();    
     }  
      
  
}  

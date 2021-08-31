package com.techment;

import javax.persistence.*;  
import java.util.*;  
public class FetchColumn {  
      
     public static void main( String args[]) {  
             
          EntityManagerFactory emf = Persistence.createEntityManagerFactory( "techment" );  
          EntityManager em = emf.createEntityManager();  
          em.getTransaction().begin( );  
                    
          Query query = em.createQuery("Select s.name from StudentEntity s");  
          @SuppressWarnings("unchecked")  
        List<String> list =query.getResultList();  
          System.out.println("Student Name :");  
          for(String s:list) {  
                
             System.out.println(s);  
          
               
          }  
            
        
          em.close();  
          emf.close();    
     }  
      
  
}  
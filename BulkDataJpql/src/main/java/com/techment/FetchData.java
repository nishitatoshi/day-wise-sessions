package com.techment;

import javax.persistence.*;  
import java.util.*;  
public class FetchData {  
      
     public static void main( String args[]) {  
             
          EntityManagerFactory emf = Persistence.createEntityManagerFactory( "techment" );  
          EntityManager em = emf.createEntityManager();  
          em.getTransaction().begin( );  
            
            
          Query query = em.createQuery( "Select s from StudentEntity s ");  
            
          @SuppressWarnings("unchecked")  
        List<StudentEntity> list=(List<StudentEntity>)query.getResultList( );  
           
          System.out.print("studentId");  
          System.out.print("\t dept");  
         System.out.println("\t name");  
            
            
          for( StudentEntity s:list ){  
             System.out.print( s.getStudentId( ));  
             System.out.print("\t" +  s.getDept( ));  
            System.out.print("\t" + s.getName( ));  
            System.out.println();  
          }  
em.getTransaction().commit();  
          em.close();  
          emf.close();    
     }  
}  

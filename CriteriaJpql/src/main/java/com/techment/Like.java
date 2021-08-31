package com.techment;

import javax.persistence.*;  
import javax.persistence.criteria.*;  
  
import java.util.*;  
public class Like {  
      
      
    public static void main( String args[]) {  
             
           
         EntityManagerFactory emf = Persistence.createEntityManagerFactory( "techment" );  
          EntityManager em = emf.createEntityManager();  
          em.getTransaction().begin( );  
            
          CriteriaBuilder cb=em.getCriteriaBuilder();  
            
          AbstractQuery<StudentEntity> cq=cb.createQuery(StudentEntity.class);  
           
            
         Root<StudentEntity> stud=cq.from(StudentEntity.class);  
           
         cq.where(cb.like(stud.get("name"), "R%"));  
          CriteriaQuery<StudentEntity> select = ((CriteriaQuery<StudentEntity>) cq).select(stud);  
          TypedQuery<StudentEntity> tq = em.createQuery(select);  
          List<StudentEntity> list = tq.getResultList();  
            
        System.out.println("Students name starting with R");  
            
          System.out.print("studentId");  
             System.out.print("\t dept");  
             System.out.println("\t name");  
            
          for(StudentEntity s:list)  
          {  
          System.out.print(s.getStudentId());  
          System.out.print("\t"+s.getDept());  
          System.out.println("\t"+s.getName());  
          }  
       em.getTransaction().commit();  
          em.close();  
          emf.close();    
     }  
}  

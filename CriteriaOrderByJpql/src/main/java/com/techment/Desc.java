package com.techment;


import javax.persistence.*;  
import javax.persistence.criteria.*;  
  
import java.util.*;  
public class Desc {  
      
      
    public static void main( String args[]) {  
             
           
         EntityManagerFactory emf = Persistence.createEntityManagerFactory( "techment" );  
          EntityManager em = emf.createEntityManager();  
          em.getTransaction().begin( );  
          CriteriaBuilder cb=em.getCriteriaBuilder();  
          CriteriaQuery<StudentEntity> cq=cb.createQuery(StudentEntity.class);  
            
         Root<StudentEntity> stud=cq.from(StudentEntity.class);  
           
          
         cq.orderBy(cb.desc(stud.get("studentId")));  
          CriteriaQuery<StudentEntity> select = cq.select(stud);  
          TypedQuery<StudentEntity> q = em.createQuery(select);  
          List<StudentEntity> list = q.getResultList();  
  
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

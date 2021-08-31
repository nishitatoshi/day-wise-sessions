package com.techment;

import javax.persistence.*;  
import javax.persistence.criteria.*;  
  
import java.util.*;  
public class Comparision {  
      
      
    public static void main( String args[]) {  
             
           
         EntityManagerFactory emf = Persistence.createEntityManagerFactory( "techment" );  
          EntityManager em = emf.createEntityManager();  
          em.getTransaction().begin( );  
            
          CriteriaBuilder cb=em.getCriteriaBuilder();  
            
          AbstractQuery<StudentEntity> cq1=cb.createQuery(StudentEntity.class);  
            
         Root<StudentEntity> stud1=cq1.from(StudentEntity.class);  
           
        cq1.where(cb.equal(stud1.get("dept"), "hr"));  
          
          CriteriaQuery<StudentEntity> select1 = ((CriteriaQuery<StudentEntity>) cq1).select(stud1);  
          TypedQuery<StudentEntity> tq1 = em.createQuery(select1);  
          List<StudentEntity> list1 = tq1.getResultList();  
            
          System.out.println("Candidates of HR department");  
            
          System.out.print("studentId");  
             System.out.print("\t dept");  
             System.out.println("\t name");  
            
          for(StudentEntity s:list1)  
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

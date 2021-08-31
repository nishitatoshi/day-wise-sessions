package com.techment;

import javax.persistence.*;  
public class PersistStudent {  
      
    public static void main(String args[])  
    {  
          
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("techment");  
        EntityManager em=emf.createEntityManager();  
 // TO INSERT VALUES         
//em.getTransaction().begin();  
//          
//        StudentEntity s1=new StudentEntity();  
//        s1.setStudentId(101);  
//        s1.setDept("hr");  
//        s1.setName("gaurav");  
//          
//        
//          
//        em.persist(s1);  
//       
//  
//em.getTransaction().commit();  
//          
//        emf.close();  
//        em.close();  
        
        // TO FIND
        
        StudentEntity s=em.find(StudentEntity.class,101);  
        
        System.out.println("Student id = "+s.getStudentId());  
        System.out.println("Student dept = "+s.getDept());  
        System.out.println("Student name = "+s.getName());
          
    }  
}  
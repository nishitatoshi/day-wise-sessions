package com.test;




import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToManyClient {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory( "techment" );  
        EntityManager em = emf.createEntityManager( );  
        em.getTransaction().begin();
        
        Library library = new Library();
        library.setName("abc library");
        em.persist(library);
        
        Book bk1 = new Book();
        bk1.setBookName("java");
        bk1.setAuthor("bala");
        bk1.setLibrary(library);
        em.persist(bk1);
        
        Book bk2 = new Book();
        bk2.setBookName("python");
        bk2.setAuthor("raj");
        bk2.setLibrary(library);
        em.persist(bk2);

       System.out.println("======inserted=====");
        
        em.getTransaction().commit();
	}

}

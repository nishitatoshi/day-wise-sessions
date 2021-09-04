package com.techment;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.techment.dao.IProductDao;
import com.techment.entity.Product;

@SpringBootApplication
public class SpringBootJpaApplication implements CommandLineRunner {

	@Autowired
	IProductDao iProductDao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("hello this is my first spring boot");
		
        Product product1 = new Product(9, "dell", "computers", 55000);
        Product product2 = new Product(10, "poco", "mobile", 5000);		

//        iProductDao.save(product1); //comment it if u are using list product
//        iProductDao.save(product2);

        System.out.println("inserted");
        
        //FIND ALL
//        
//        List<Product> products=iProductDao.findAll();
//        products.forEach(System.out::println);
//        
//       Optional<Product> product = iProductDao.findById(10);
//       if(product.isPresent())
//    	   System.out.println("Products "+product.get());
//       else
//    	   System.out.println("no product found with the given id");
       
       //COUNT
       
       long totalproducts = iProductDao.count();
       System.out.println("total number of products: "+totalproducts);
       
//       //DELETE by ID
//       
//       iProductDao.deleteById(7);
//       System.out.println("deleted");
//       
       //CHECK if product is present or not , then delete
      
//      
//       try
//       {
//    	   iProductDao.existsById(7);
//       }
//       catch (Exception e)
//       {
//    	   System.out.println("no product found");
//       }
       
       
     List<Product> prod =  iProductDao.findByName("mi");
     System.out.println("PRODUCT "+ prod);
     
     List<Product> prodList =iProductDao.findByCategory("mobile");
     System.out.println("PRODUCT "+ prodList);
     
     

	}

}

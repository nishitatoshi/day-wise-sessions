package com.techment.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techment.entity.Product;
import java.lang.String;
import java.util.List;

@Repository
public interface IProductDao extends JpaRepository<Product, Integer> {

   List<Product> findByName(String name);
   List<Product> findByCategory(String category);
   List<Product> findByNameAndCategory(String category, String name);
   List<Product> findByNameContains(String ch);
}

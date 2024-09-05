package com.verizon.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.verizon.model.Product;

@Repository

public interface ProductDao  extends JpaRepository<Product,Integer>{

	//write custom Query to get all products between given low and high price
	@Query("SELECT p FROM Product p WHERE p.price BETWEEN :low AND :high")
    List<Product> findAllProductsBetweenPrice(@Param("low") int low, @Param("high") int high);
	
	
}

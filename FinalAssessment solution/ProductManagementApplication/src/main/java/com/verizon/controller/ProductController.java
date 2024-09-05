package com.verizon.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.exceptions.ProductNotFoundException;
import com.verizon.model.Product;
import com.verizon.service.ProductService;
@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	@GetMapping("/product")
	public List<Product> getAllProducts() {
		return productService.getProducts();
	}
	
	@GetMapping("/product1/{pid}")
	public Product getProduct(@PathVariable("pid") Integer pid) {  
				return productService.getProduct(pid);
	}
	
	@GetMapping("/product/{low}/{high}")
	public List<Product> getProductBetweenPriceRange(@PathVariable("low") Integer low, @PathVariable("high")Integer high) {  
	
		return productService.getProductsBetweenLowHigh(low, high);
	}
	
  @PostMapping("/product") 
  public String  addProductDetails(@RequestBody	  Product product){
	  String result=productService.addProduct(product);
	  return  "Added";
	  }
	
	@PutMapping("/product/{pid}") 
	public Product updateProductDetails(@PathVariable("pid") Integer pid,@RequestBody Product product) {
		return productService.updatePlan(pid, product);
	}
	
	@DeleteMapping("/product/{pid}") 
	public Product deleteProductDetails(@PathVariable("pid") Integer pid) {
		
		return  productService.deletePlan(pid); 
	}
	
}

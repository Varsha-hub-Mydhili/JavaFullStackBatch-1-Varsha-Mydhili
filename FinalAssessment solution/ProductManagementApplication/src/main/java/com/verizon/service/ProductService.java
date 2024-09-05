package com.verizon.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.verizon.dao.ProductDao;
import com.verizon.exceptions.ProductNotFoundException;
import com.verizon.model.Product;
import jakarta.transaction.Transactional;
@Service
@Transactional
public class ProductService {
	@Autowired
	ProductDao productDao;
	public String addProduct(Product product) {
		productDao.save(product);
		return "Added";
	}
	public   List<Product> getProducts() {
		List<Product> productList=productDao.findAll();
		return productList;
	}
	
	public   Product getProduct(Integer pid)  {
		Product product=productDao.findById(pid).get(); 
		if (product == null) {
            throw new ProductNotFoundException ("No value present");
		
	}
		return product;
		}
	
	public   List<Product> getProductsBetweenLowHigh(Integer low,Integer high) {
		List<Product> productList= productDao.findAllProductsBetweenPrice(low,high);
		return productList;
	}
	public Product updatePlan(Integer pid,Product product) {
		Product product1=productDao.findById(pid).get();
		if (product1 == null) {
            throw new ProductNotFoundException ("No value present"  );
		
	}
		product1.setPrice(product.getPrice());
		return product1 ;
	}
	public Product deletePlan(Integer pid) {
		Product product2=productDao.findById(pid).get();
		
		if(product2==null)
			throw new ProductNotFoundException ("No value present" );
		else
			productDao.deleteById(pid);
		return product2;
		}
	}

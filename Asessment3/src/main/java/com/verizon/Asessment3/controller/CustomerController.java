package com.verizon.Asessment3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.Asessment3.model.Customer;
import com.verizon.Asessment3.services.CustomerServices;


@RestController
public class CustomerController {
	
	@Autowired
	CustomerServices customerServices;
	@GetMapping("/customer")
	public List<Customer> getCustomerDetails() {  
		return customerServices.getCustomer();
	}

	
	  @PostMapping("/customer") 
	  public String  addCustomerDetails(@RequestBody Customer customer) {
		  String result=customerServices.addCustomer(customer);
		  return result;
	 
	  }
	
	@PutMapping("/customer/{cid}") 
	public Customer updateCustomerDetails(@PathVariable("cid") Integer cid,@RequestBody Customer customer ) {
		return customerServices.updateCustomer(cid, customer);
	}
	
	@DeleteMapping("/customer/{cid}") 
	public Customer deleteCustomerDetails(@PathVariable("cid") Integer cid) {

		return  customerServices.deleteCustomer(cid); 
	}
	
	
	

}

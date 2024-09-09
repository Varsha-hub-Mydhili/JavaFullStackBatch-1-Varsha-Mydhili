package com.tms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tms.modal.Customers;
import com.tms.modal.Plan;
import com.tms.services.CustomerServices;

@RestController
public class CustomerController {
	@Autowired
	CustomerServices customerservice;
	
	@GetMapping("/customers")
	public List<Customers> getCustomerDetails(){
		return customerservice.getCustomer();
	}
	@GetMapping("/customers/{cname}")
	public Customers getCustomerByName(@PathVariable String cname) {
		return customerservice.findByName(cname);
	}
	@GetMapping("/customer1/{cid}")
	public Customers getCustomerDetails(@PathVariable("cid") Integer cid) {
		return customerservice.getCustomerById(cid);
	}
	
	}


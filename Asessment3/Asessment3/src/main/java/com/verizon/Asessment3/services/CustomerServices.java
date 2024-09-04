package com.verizon.Asessment3.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.Asessment3.dao.CustomerDao;
import com.verizon.Asessment3.model.Customer;


import jakarta.transaction.Transactional;

@Service
@Transactional
public class CustomerServices {
	@Autowired
	CustomerDao customerDao;
	
	public String addCustomer(Customer customer) {
		customerDao.save(customer);
		return "Added successfully";
	}
	public   List<Customer> getCustomer() {
		//
		List<Customer> customerList=customerDao.findAll();
		return customerList;
	}
	public Customer updateCustomer(Integer cid,Customer customer) {
		Customer customer1=customerDao.findById(cid).get();
		customer1.setEmail(customer.getEmail());
		
		return customerDao.findById(cid).get();
	}
	public Customer deleteCustomer(Integer cid) {
		Customer customer1=customerDao.findById(cid).get();
		if(cid!=null)
			customerDao.deleteById(cid);
		return customer1;
		}
	
	
	

}

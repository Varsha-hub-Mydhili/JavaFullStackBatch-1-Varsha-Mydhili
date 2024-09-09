package com.tms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exception.ResourceNotFoundException;
import com.tms.dao.CustomerDao;
import com.tms.modal.Customers;
import com.tms.modal.Plan;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CustomerServices {
	@Autowired
	CustomerDao customerdao;
	
	public List<Customers> getCustomer(){
		List<Customers> clist=customerdao.findAll();
		return clist;
		
	}
	
	public Customers findByName(String cname) {
		Customers customer = customerdao.findByCname(cname);
		if (customer == null) {
            throw new ResourceNotFoundException("Customer not found with name " + cname);
        }
		return customer;
		
	}
	
	public Customers getCustomerById(Integer cid) {
		Customers customer1=customerdao.findById(cid).get();
		return customer1;
	}
	
	
	

}

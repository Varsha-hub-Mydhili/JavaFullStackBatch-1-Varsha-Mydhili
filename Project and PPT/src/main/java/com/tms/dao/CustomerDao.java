package com.tms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tms.modal.Customers;

@Repository
public interface CustomerDao extends JpaRepository<Customers,Integer> {
	 Customers findByCname(String cname);
	 

}

package com.verizon.Asessment3.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.verizon.Asessment3.model.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer,Integer>  {

}

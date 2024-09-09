package com.tms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tms.modal.Customers;
import com.tms.modal.Plan;

@Repository
public interface PlanDao extends JpaRepository<Plan,Integer> {
	Plan findByPname(String pname);

}

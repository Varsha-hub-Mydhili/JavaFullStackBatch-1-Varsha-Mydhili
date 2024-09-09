package com.tms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exception.ResourceNotFoundException;
import com.tms.dao.PlanDao;
import com.tms.modal.Customers;
import com.tms.modal.Plan;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PlanService {
	@Autowired
	PlanDao plandao;
	public String addPlan(Plan plan) {
		plandao.save(plan);
		return "Added";
	}
	public List<Plan> getPlans(){
		List<Plan> planList=plandao.findAll();
		return planList;
		
	}
	public Plan updatePlan(Integer pid,Plan plan) {
		Plan plan1=plandao.findById(pid).get();
		plan1.setValidity(plan.getValidity());
		return plan1;
	}
	public String deletePlan(Integer pid) {
		Plan plan1=plandao.findById(pid).get();
		if(plan1!=null)
		plandao.deleteById(pid);
		return "deleted"; 
	
		
		}
	public Plan getPlanById(Integer pid) {
		Plan plan1=plandao.findById(pid).get();
		return plan1;
	}
	
	public Plan findByName(String pname) {
		Plan plan = plandao.findByPname(pname);
		if (plan == null) {
            throw new ResourceNotFoundException("Plan not found with name " + pname);
        }
		return plan;
	
	
	
	
	
	

}
	}

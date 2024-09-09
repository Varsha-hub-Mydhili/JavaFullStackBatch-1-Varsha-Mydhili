package com.tms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tms.modal.Customers;
import com.tms.modal.Plan;
import com.tms.services.PlanService;

@RestController
public class PlanController {
	
	@Autowired
	PlanService planservice;
	
	@GetMapping("/plan")
	public List<Plan> getPlanDetails() {
		return planservice.getPlans();
	}
	@PostMapping("/plan")
	public String addPlanDetails(@RequestBody Plan plan) {
		String result=planservice.addPlan(plan);
		return result;
		
	}
	@PutMapping("/plan/{pid}")
	public Plan updatePlanDetails(@PathVariable("pid") Integer pid,@RequestBody Plan plan) {
		return planservice.updatePlan(pid, plan);
	}
	
	@DeleteMapping("/plan/{pid}")
	public String deletePlanDetails(@PathVariable("pid") Integer pid) {
		return planservice.deletePlan(pid);
		}
	
	@GetMapping("/plan/{pid}")
	public Plan getPlanDetails(@PathVariable("pid") Integer pid) {
		return planservice.getPlanById(pid);
	}
	
	@GetMapping("/plan1/{pname}")
	public Plan getPlanByName(@PathVariable String pname) {
		return planservice.findByName(pname);
	}
	}

package com.tms.services;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tms.dao.PlanDao;
import com.tms.modal.Plan;

import junit.framework.Assert;

@SpringBootTest
@RunWith(SpringRunner.class)
class PlanServiceTest {
	
	
	@Mock
	private PlanDao planDao;
	
	@Autowired
	private PlanService planService;
	
	
	


	@Test
	public void testAddPlan() {
		//fail("Not yet implemented");
		Plan plan=new Plan();
		plan.setPid(20);
		plan.setPname("TestPlanName");
		plan.setValidity(28);
		plan.setData(6);
		plan.setVoice(199);
		plan.setSms(100);
		plan.setPrice(299);
		
		Mockito.when(planDao.save(plan)).thenReturn(plan);
		Assert.assertEquals("Added",planService.addPlan(plan));

}
	
	@Test 
	public void testGetPlan() {
		Plan plan = new Plan();
		plan.setPid(20);
		plan.setPname("TestPlanName");
		plan.setValidity(28);
		plan.setData(6);
		plan.setVoice(199);
		plan.setSms(100);
		plan.setPrice(299);
		Mockito.when(planDao.findAll()).thenReturn(Arrays.asList(plan));
        List<Plan> plans = planService.getPlans();
        //assertEquals(1, plans.size());
        assertEquals("TestPlanName", plans.get(plans.size() - 1).getPname());
    }
		
    
	
	@Test
    void testGetPlanById() {
		
		Plan plan = new Plan();
		plan.setPid(20);
		plan.setPname("TestPlanName");
		plan.setValidity(28);
		plan.setData(6);
		plan.setVoice(199);
		plan.setSms(100);
		plan.setPrice(299);
		
        Mockito.when(planDao.findById(20)).thenReturn(Optional.of(plan));
        Plan foundPlan = planService.getPlanById(20);
        assertEquals("TestPlanName", foundPlan.getPname());
    }
	
	@Test
    void testFindByName() {
		
		Plan plan = new Plan();
		plan.setPid(20);
		plan.setPname("TestPlanName");
		plan.setValidity(28);
		plan.setData(6);
		plan.setVoice(199);
		plan.setSms(100);
		plan.setPrice(299);
		
        Mockito.when(planDao.findByPname("TestPlanName")).thenReturn(plan);
        Plan foundPlan = planService.findByName("TestPlanName");
        assertEquals("TestPlanName", foundPlan.getPname());
    }
	
	 @Test
	    void testDeletePlan() {
		    Plan plan = new Plan();
			plan.setPid(20);
			plan.setPname("TestPlanName");
			plan.setValidity(28);
			plan.setData(6);
			plan.setVoice(199);
			plan.setSms(100);
			plan.setPrice(299);
			Mockito.when(planDao.findById(20)).thenReturn(Optional.of(plan));
			assertEquals("deleted", planService.deletePlan(20));
		 
		 
	}
	
	

	
	
	
	

		
		
		
	}
	


package com.tms.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tms.modal.CallDetails;
import com.tms.services.CallServices;

import jakarta.persistence.Entity;


@RestController
public class CallController {
	@Autowired
	CallServices callServices;
	
	@GetMapping("/call")
	public List<CallDetails> getPlanDetails() {
		return callServices.getAllCallDetails();
	}
	@PostMapping("/call")
	public CallDetails addCallDetails(@RequestBody CallDetails call) {
		CallDetails result=callServices.addCall(call);
		return result;
	}
	
	@GetMapping("/call/{callid}")
    public CallDetails getCallDetailsByCallerId(@PathVariable int callid) {
        return  callServices.getCallDetailsById(callid);
    }
	
	@GetMapping("/call1/{fromCid}")
	public List<String> getCallDetailsByCustomerId(@PathVariable int fromCid) {
        return callServices.findCallDetailsByCid(fromCid);
    }
	
	@GetMapping("/calls/date/{startTime}")
    public List<String> getCallDetailsByDate(@PathVariable("startTime") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime startTime) {
        return callServices.findCallsByDate(startTime);
    }
	
	
	

}

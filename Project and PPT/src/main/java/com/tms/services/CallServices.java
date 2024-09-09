package com.tms.services;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exception.ResourceNotFoundException;
import com.tms.dao.CallDao;
import com.tms.modal.CallDetails;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CallServices {
	@Autowired
	CallDao callDao;
	
	public CallDetails addCall(CallDetails call) {
		call.calculateCallDuration();
		return callDao.save(call);
	}
	
	
	
	public List<CallDetails> getAllCallDetails() {
        return callDao.findAll();
    }
	
	
	
	public CallDetails getCallDetailsById(Integer callId) {
        return callDao.findById(callId).orElseThrow(() -> new ResourceNotFoundException("CallDetails not found with id " + callId));
    }
	
	
	
	public List<String> findCallDetailsByCid(int fromCid) {
        List<CallDetails> callDetailsList = callDao.findByFromCid(fromCid);
        
        if (callDetailsList.isEmpty()) {
            throw new ResourceNotFoundException("No calls found for customer ID " + fromCid);
        }
        
        long totalDurationInMinutes = callDetailsList.stream()
                .mapToLong(CallDetails::getCall_duration)
                .sum();
        String summary = "You have consumed " + totalDurationInMinutes + " minutes of your plan";
        List<String> callDetailsStrings = callDetailsList.stream()
                .map(call -> "Call ID: " + call.getCallid() + ", Duration: " + call.getCall_duration() + " minutes")
                .collect(Collectors.toList());
        callDetailsStrings.add(summary);
        
        return callDetailsStrings;
        }
	
	
	
	
	public List<String> findCallsByDate(LocalDateTime startTime) {
 
        LocalDateTime startOfDay = startTime;
        List<CallDetails> callDetailsList = callDao.findByStartTime(startOfDay);

        if (callDetailsList.isEmpty()) {
            throw new ResourceNotFoundException("No calls found on date " + startTime);
        }

        List<String> callDetailsStrings = callDetailsList.stream()
                .map(call -> "Call ID: " + call.getCallid() + ", From: " + call.getFrom_cid() +
                        ", To: " + call.getToCid() + ", Duration: " + call.getCall_duration() + " minutes")
                .collect(Collectors.toList());

       
        String countSummary = "Total number of calls on " + startTime + ": " + callDetailsList.size();
        callDetailsStrings.add(countSummary);

        return callDetailsStrings;
    }
	
	
	

}

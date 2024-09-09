package com.tms.modal;

import java.time.Duration;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CallDetails {
	
	@Id
	int callid;
	int fromCid;
	int toCid;
	LocalDateTime startTime;
	LocalDateTime endTime;
	Long call_duration;
	
	
public CallDetails() {
		
	}

	public CallDetails(int callid, int from_cid, int toCid, LocalDateTime startTime, LocalDateTime endTime,
			Long call_duration) {
		super();
		this.callid = callid;
		this.fromCid = from_cid;
		this.toCid = toCid;
		this.startTime = startTime;
		this.endTime = endTime;
		this.call_duration = call_duration;
	}
	
	
	public int getCallid() {
		return callid;
	}

	public void setCallid(int callid) {
		this.callid = callid;
	}

	public int getFrom_cid() {
		return fromCid;
	}

	public void setFrom_cid(int fromCid) {
		this.fromCid = fromCid;
	}

	public int getToCid() {
		return toCid;
	}

	public void setTo_cid(int to_cid) {
		this.toCid = toCid;
	}

	public LocalDateTime getStart_time() {
		return startTime;
	}

	public void setStart_time(LocalDateTime start_time) {
		this.startTime = start_time;
	}

	public LocalDateTime getEnd_time() {
		return endTime;
	}

	public void setEnd_time(LocalDateTime end_time) {
		this.endTime = end_time;
	}

	public Long getCall_duration() {
		return call_duration;
	}

	public void setCall_duration(Long call_duration) {
		this.call_duration = call_duration;
	}
	
	public void calculateCallDuration() {
        if (startTime != null && endTime != null) {
            this.call_duration = Duration.between(startTime, endTime).toMinutes();
        }
    }

	@Override
	public String toString() {
		return "CallDetails [callid=" + callid + ", from_cid=" + fromCid + ", to_cid=" + toCid + ", start_time="
				+ startTime + ", end_time=" + endTime + ", call_duration=" + call_duration + "]";
	}

	
	
	

}

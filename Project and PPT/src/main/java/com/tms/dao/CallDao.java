package com.tms.dao;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tms.modal.CallDetails;

@Repository
public interface CallDao extends JpaRepository<CallDetails,Integer> {
	List<CallDetails> findByFromCid(int fromCid);
	List<CallDetails> findByStartTime(LocalDateTime startTime);

}

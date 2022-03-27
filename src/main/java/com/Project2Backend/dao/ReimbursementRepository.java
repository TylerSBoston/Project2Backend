package com.Project2Backend.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.Project2Backend.entities.ReimbursementEntity;



@Repository
public interface ReimbursementRepository 
			extends JpaRepository<ReimbursementEntity, Integer> {
	
	List<ReimbursementEntity> fetchARequest(@PathVariable int reimbursementId);
	
	
	
	

}

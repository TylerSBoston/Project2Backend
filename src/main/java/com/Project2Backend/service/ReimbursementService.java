package com.Project2Backend.service;

import java.util.List;

import java.util.Optional;


import com.Project2Backend.entities.ReimbursementEntity;



public interface ReimbursementService {
		//FOR SUBMIT NEW REIMBURSEMENT
	 
	 	
	 //LIST ALL REIMBURSEMENTS
	 
	 List<ReimbursementEntity> getAllReimbursements();
	 
	 Optional<ReimbursementEntity> findById(int reimbursementId);
	
	 ReimbursementEntity save(ReimbursementEntity reimbursementEntity);
	 
	


	 
	 
	




	
	
	

	
	

	
	
	
	
	
	

	 
	 	

	
}

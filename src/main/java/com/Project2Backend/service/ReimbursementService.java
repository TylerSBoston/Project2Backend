package com.Project2Backend.service;

import java.util.List;

import java.util.Optional;


import com.Project2Backend.entities.ReimbursementEntity;



public interface ReimbursementService {
		//FOR SUBMIT NEW REIMBURSEMENT
	 
	 	
	 //LIST ALL REIMBURSEMENTS
	 
	 List<ReimbursementEntity> getAllReimbursements();
	 
	 Optional<ReimbursementEntity> findById(int reimbursementId);
	
	 void save(ReimbursementEntity reimbursementEntity);

	ReimbursementEntity updateReimbursement(ReimbursementEntity reimbursementEntity);

	ReimbursementEntity save1(ReimbursementEntity reimbursementEntity);

//	ReimbursementEntity addReimbursement(ReimbursementEntity reimbursementEntity);
	 
	


	 
	 
	




	
	
	

	
	

	
	
	
	
	
	

	 
	 	

	
}

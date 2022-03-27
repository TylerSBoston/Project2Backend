package com.Project2Backend.service;

import java.util.List;

import com.Project2Backend.entities.ReimbursementEntity;

public interface ReimbursementService {
		//FOR SUBMIT NEW REIMBURSEMENT
	 ReimbursementEntity addReimbursement(ReimbursementEntity reimbursementEntity);
	 	//LIST ALL REIMBURSEMENTS
	 List<ReimbursementEntity> findAllReimbursements();
	 	// FETCH SINGLE REIMBURSEMENT WITH REIMBURSEMENT ID
	 ReimbursementEntity findById(int reimbursementId);
	 	// UPDATE REIMBURSEMENT
	void updateRequest(ReimbursementEntity reimbursementEntity);

	 
	 	

	
}

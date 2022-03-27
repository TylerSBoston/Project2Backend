package com.Project2Backend.service;

import java.util.List;

import com.Project2Backend.entities.ReimbursementEntity;
import com.Project2Backend.exceptions.ReimbursementNotFoundException;
import com.Project2Backend.exceptions.SystemException;

public interface ReimbursementService {
		//FOR SUBMIT NEW REIMBURSEMENT
	 ReimbursementEntity addReimbursement(ReimbursementEntity reimbursementEntity)throws SystemException,
	 ReimbursementNotFoundException;
	 	//LIST ALL REIMBURSEMENTS
	 List<ReimbursementEntity> findAllReimbursements()throws SystemException;
	 	// FETCH SINGLE REIMBURSEMENT WITH REIMBURSEMENT ID
	 ReimbursementEntity findById(int reimbursementId)throws SystemException;
	 	// UPDATE REIMBURSEMENT
	 void updateRequest(ReimbursementEntity reimbursementEntity)throws SystemException;
	
	

	 
	 	

	
}

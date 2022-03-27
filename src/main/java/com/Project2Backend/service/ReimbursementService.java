package com.Project2Backend.service;

import java.util.List;
import java.util.Optional;

import com.Project2Backend.entities.EmployeeEntity;
import com.Project2Backend.entities.ReimbursementEntity;

import com.Project2Backend.exceptions.ReimbursementNotFoundException;
import com.Project2Backend.exceptions.SystemException;
import com.Project2Backend.pojo.Employee;

public interface ReimbursementService {
		//FOR SUBMIT NEW REIMBURSEMENT
	 
	 	
	 //LIST ALL REIMBURSEMENTS
	 
	 List<ReimbursementEntity> findAllReimbursements()throws SystemException;
	 	// FETCH SINGLE REIMBURSEMENT WITH REIMBURSEMENT ID
	
	 ReimbursementEntity submitRequest(ReimbursementEntity reimbursementEntity)throws SystemException;
	 
	 ReimbursementEntity updateRequest(ReimbursementEntity reimbursementEntity)throws SystemException;
	 
	 ReimbursementEntity fetchaRequest(int reimbursementId)throws SystemException;
	 
	 ReimbursementEntity findById1(int ReimbursementId)throws SystemException;

	List<EmployeeEntity> findAll1();

	EmployeeEntity updateEmployee(EmployeeEntity employeeEntity);

	EmployeeEntity findById(int employeeId);

	Optional<EmployeeEntity> fetchAEmployee(int employeeId);
	
	EmployeeEntity save(EmployeeEntity employeeEntity);
	 
	 
	




	
	
	

	
	

	
	
	
	
	
	

	 
	 	

	
}

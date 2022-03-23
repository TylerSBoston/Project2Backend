package com.Project2Backend.service;


import java.util.List;

import com.Project2Backend.pojo.Employee;
import com.Project2Backend.pojo.Reimbursement;



import exceptions.ReimbursementNotFoundException;
import exceptions.SystemException;

public interface EmployeeService{
	
	// Read - fetch all books
		List<Reimbursement> fetchAllReimbursements()throws  SystemException, ReimbursementNotFoundException;
		// Create
		

		Reimbursement submitRequest(Reimbursement reimbursement)throws  SystemException;
		
		Reimbursement fetchARequest(int employeeID)throws SystemException;
		
		Reimbursement updateReimbursement(Reimbursement reimbursement)throws SystemException;
		
		Employee updateEmployee (Employee employee)throws SystemException;
		

		
		
		

		
		
		
		
		
		//Exit
		void exitApplication()throws SystemException;
		
	}
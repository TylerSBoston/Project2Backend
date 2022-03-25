package com.Project2Backend.service;


import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Project2Backend.pojo.Employee;
import com.Project2Backend.pojo.Reimbursement;
import com.Project2Backend.entities.EmployeeEntity;
import com.Project2Backend.exceptions.EmployeeNotFound;
import com.Project2Backend.exceptions.ReimbursementNotFoundException;
import com.Project2Backend.exceptions.SystemException;
@Service
public interface EmployeeService{
	
	// Read - fetch all books
		List<Reimbursement> fetchAllReimbursements()throws  SystemException, ReimbursementNotFoundException;
		// Create
		

		Reimbursement submitRequest(Reimbursement reimbursement)throws  SystemException;
		
		Reimbursement fetchARequest(int employeeId)throws SystemException;
		
		Reimbursement updateReimbursement(Reimbursement reimbursement)throws SystemException;
		
		Employee updateEmployee (Employee employee)throws SystemException;


		List<Employee> fetchAllEmployees() throws SystemException, EmployeeNotFound;
		

		
			

}
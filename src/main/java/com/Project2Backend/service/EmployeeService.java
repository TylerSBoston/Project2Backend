package com.Project2Backend.service;


import java.util.LinkedList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project2Backend.pojo.Employee;
import com.Project2Backend.pojo.Reimbursement;

import com.Project2Backend.entities.EmployeeEntity;
import com.Project2Backend.exceptions.EmployeeNotFound;
import com.Project2Backend.exceptions.ReimbursementNotFoundException;
import com.Project2Backend.exceptions.SystemException;
@Service
public interface EmployeeService{

	
	
		List<Reimbursement> fetchAllReimbursements()throws  SystemException, ReimbursementNotFoundException;
		// Create
		

		
		
		Reimbursement fetchARequest(int employeeId)throws SystemException;
		
		Reimbursement updateReimbursement(Reimbursement reimbursement)throws SystemException;
		
		Employee updateEmployee (Employee employee)throws SystemException;


		List<Employee> fetchAllEmployees() throws SystemException, EmployeeNotFound;
		
		
		
		
		Reimbursement submitRequest(Reimbursement reimbursement)throws  SystemException;
			
		}
		

		
			


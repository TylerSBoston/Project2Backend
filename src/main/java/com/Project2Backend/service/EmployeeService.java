package com.Project2Backend.service;




import java.util.List;


import org.springframework.stereotype.Service;

import com.Project2Backend.pojo.Employee;
import com.Project2Backend.pojo.Reimbursement;


import com.Project2Backend.exceptions.EmployeeNotFound;

import com.Project2Backend.exceptions.SystemException;
@Service
public interface EmployeeService{

	
	
		

		
		
	
		
		Reimbursement updateReimbursement(Reimbursement reimbursement)throws SystemException;
		
		Employee updateEmployee (Employee employee)throws SystemException;


		List<Employee> fetchAllEmployees() throws SystemException, EmployeeNotFound;
		
		
		
		
		Reimbursement submitRequest(Reimbursement reimbursement)throws  SystemException;
			
		}
		

		
			


package com.Project2Backend.dao;

import java.util.List;




import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Project2Backend.pojo.Employee;
import com.Project2Backend.pojo.Reimbursement;


import exceptions.ReimbursementNotFoundException;
import exceptions.SystemException;



@Repository
public interface EmployeeDao  {

	
	
	@Query("select u from EmployeeEntity u where ?1.userName = u.userName and ?1.password = u.password")
	Employee login(Employee e);
	
	// Read - fetch all books
			List<Reimbursement> fetchAllReimbursements()throws SystemException, ReimbursementNotFoundException;
			// Create
			

			Reimbursement submitRequest(Reimbursement reimbursement)throws SystemException;
			
			Reimbursement fetchARequest(int employeeId)throws SystemException;
			
			Reimbursement updateReimbursement(Reimbursement reimbursement)throws SystemException;
			
			Employee updateEmployee (Employee employee)throws SystemException;
			
			
			

			
			
			

			
			
			
			
			void exitApplication()throws SystemException;
	
	

}

package com.Project2Backend.controller;

import java.util.List;

import javax.transaction.SystemException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project2Backend.pojo.Employee;
import com.Project2Backend.pojo.Reimbursement;
import com.Project2Backend.service.FinanceManagerService;

@RestController
@CrossOrigin
@RequestMapping("finance-manager")
public class FinanceManagerController {

	@Autowired
	FinanceManagerService fms;
	
	@GetMapping("requests-pending")
	List<Reimbursement>  fetchPendingReimbursements() throws SystemException
	{
		return fms.getPendingReimbursements();	
	}
	
	@GetMapping("/requests-resolved")
	List<Reimbursement>  fetchCompletedReimbursements() throws SystemException{
		return fms.getCompletedReimbursements();		
	}
	
	@GetMapping("/requests-all")
	List<Reimbursement>  fetchAllReimbursements() throws SystemException{
		return fms.getAllReimbursements();	
		
	}
	
	@GetMapping("/requests-employee/{bid}")
	List<Reimbursement>  fetchEmployeeReimbursements(@PathVariable("bid") int bid) throws SystemException{
		return fms.getEmployeeReimbursements(bid);
		
	}
	
	@GetMapping("/all-employees-manager-view") 
	List<Employee>  fetchAllEmployees() throws SystemException{
		return fms.getAllEmployees();	
	}
	
	// what is the practical difference between post/put my post both inserts and updates a table.
	@PostMapping("/update-request")
	Reimbursement updateReimbursement(@RequestBody Reimbursement reimbursement) throws SystemException {
		return fms.updateReimbursement(reimbursement);
	}
	

	
	
	
}

package com.Project2Backend.controller;

import java.util.List;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project2Backend.pojo.Employee;
import com.Project2Backend.pojo.Reimbursement;
import com.Project2Backend.service.EmployeeService;
import com.Project2Backend.service.EmployeeServiceImpl;

import exceptions.ReimbursementNotFoundException;
import exceptions.SystemException;

@RestController
@RequestMapping("api")
public class ReimbursementController {
	
	EmployeeService employeeService = new EmployeeServiceImpl();
	
	
	@GetMapping("reimbursements")
	public List<Reimbursement> fetchAllReimbursements() throws SystemException, ReimbursementNotFoundException {
		// TODO Auto-generated method stub
		return employeeService.fetchAllReimbursements();
	}

	@PostMapping("reimbursements")
	public Reimbursement submitRequest(@RequestBody Reimbursement reimbursement) throws SystemException {
		// TODO Auto-generated method stub
		return employeeService.submitRequest(reimbursement);
	}

	@PutMapping("reimbursements")
	public Reimbursement updateReimbursement(@RequestBody Reimbursement reimbursement) throws SystemException {
		// TODO Auto-generated method stub
		return employeeService.updateReimbursement(reimbursement);
	}

	
	@GetMapping("reimbursements/{employeeId}")
	public Reimbursement fetchARequest(int employeeID) throws SystemException {
		// TODO Auto-generated method stub
		return employeeService.fetchARequest(employeeID);
	}
	
	@PutMapping("employee")
	public Employee updateEmployee(Employee employee) throws SystemException {
		// TODO Auto-generated method stub
		return employeeService.updateEmployee(employee);
	}



}

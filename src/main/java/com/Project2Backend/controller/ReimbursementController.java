package com.Project2Backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project2Backend.pojo.Employee;
import com.Project2Backend.pojo.Reimbursement;
import com.Project2Backend.service.EmployeeServiceImpl;

import com.Project2Backend.exceptions.ReimbursementNotFoundException;
import com.Project2Backend.exceptions.SystemException;

@RestController
@CrossOrigin
@RequestMapping("api")
public class ReimbursementController {
	@Autowired
	EmployeeServiceImpl employeeService;
	
	
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
	 Reimbursement updateReimbursement(@RequestBody Reimbursement reimbursement) throws SystemException {
		// TODO Auto-generated method stub
		return employeeService.updateReimbursement(reimbursement);
	}

	
	@GetMapping("reimbursements/{employeeId}")
	public Reimbursement fetchARequest(@PathVariable("employeeId") int employeeId) throws SystemException {
		// TODO Auto-generated method stub
		return employeeService.fetchARequest(employeeId);
	}
	
	@PutMapping("employee")
	public Employee updateEmployee(Employee employee) throws SystemException {
		// TODO Auto-generated method stub
		return employeeService.updateEmployee(employee);
	}



}

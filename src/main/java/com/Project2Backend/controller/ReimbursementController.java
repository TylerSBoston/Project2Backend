package com.Project2Backend.controller;


import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.web.bind.annotation.RestController;






import com.Project2Backend.dao.EmployeeDao;

import com.Project2Backend.dao.ReimbursementDao;
import com.Project2Backend.entities.EmployeeEntity;
import com.Project2Backend.entities.ReimbursementEntity;

import com.Project2Backend.exceptions.SystemException;

@RestController
@CrossOrigin
@RequestMapping("api")
public class ReimbursementController {
	
	@Autowired
	ReimbursementDao reimbursementDao;
	@Autowired
	EmployeeDao employeeDao;
	
	
	@GetMapping(value = "/reimbursements")
	public List<ReimbursementEntity> reimsfindAll() {
		return reimbursementDao.findAll();
	
	}
	
	@GetMapping(value = "/reimbursements/{reimbursementId}")
	public Optional<ReimbursementEntity> fetchARequest(@PathVariable final int reimbursementId) {
		// TODO Auto-generated method stub
		return reimbursementDao.findById(reimbursementId);
	}
	
	@PostMapping(value = "/reimbursements")
	public Optional<ReimbursementEntity> submitRequest(@RequestBody final ReimbursementEntity reimbursementEntity) throws SystemException {
		reimbursementDao.save(reimbursementEntity);
		 return reimbursementDao.findById(reimbursementEntity.getReimbursementId());
			
	}
	
	@PutMapping(value = "/reimbursements")
	public List<ReimbursementEntity> updateRequest(@RequestBody ReimbursementEntity reimbursementEntity) throws SystemException {
		reimbursementDao.save(reimbursementEntity);
	
		return reimbursementDao.findById(reimbursementEntity);
	}
	
	
	
	
	
	
	
	
	@GetMapping(value = "/employees")
	public List<EmployeeEntity> findAll1() {
		// TODO Auto-generated method stub
		return employeeDao.findAll();
	}
	
	
	
	@GetMapping
	(value = "/employees/{employeeId}")
	public List<EmployeeEntity> fetchAEmployee(@PathVariable("employeeId") int employeeId) throws SystemException {
		// TODO Auto-generated method stub
		return employeeDao.findById(employeeId);
	}
	
	
	

	
	@PutMapping(value = "/employees")
	public List<EmployeeEntity> updateEmployee(@RequestBody EmployeeEntity employeeEntity) throws SystemException {
		employeeDao.save(employeeEntity);
	
		return employeeDao.findById(employeeEntity.getEmployeeId());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//	@GetMapping("employees")
//	public List<Employee> fetchAllEmployees() throws SystemException, EmployeeNotFound {
//		// TODO Auto-generated method stub
//		return employeeService.fetchAllEmployees();
//	}

//	@PostMapping("reimbursements")
//	public Reimbursement submitRequest(@RequestBody Reimbursement reimbursement) throws SystemException {
//		// TODO Auto-generated method stub
//		return employeeService.submitRequest(reimbursement);
//	}
//
//	@PutMapping("reimbursements")
//	 Reimbursement updateReimbursement(@RequestBody Reimbursement reimbursement) throws SystemException {
//		// TODO Auto-generated method stub
//		return employeeService.updateReimbursement(reimbursement);
//	}

	
//	@GetMapping("reimbursements/{reimbursementId}")
//	public Reimbursement fetchARequest(@PathVariable("reimbursementId") int reimbursementId) throws SystemException {
//		// TODO Auto-generated method stub
//		return employeeService.fetchARequest(reimbursementId);
//	}
	
//	@GetMapping("employees/{employeeId}")
//	public Employee fetchAEmployee(@PathVariable("employeeId") int employeeId) throws SystemException {
//		// TODO Auto-generated method stub
//		return employeeService.fetchAEmployee(employeeId);
//	}
	
//	@PutMapping("employees")
//	public Employee updateEmployee(Employee employee) throws SystemException {
//		// TODO Auto-generated method stub
//		return employeeService.updateEmployee(employee);
//	}
	
//	  @PostMapping("reimbursements")
//	  public ResponseEntity<ReimbursementEntity> submitRequest(@RequestBody ReimbursementEntity reimbursementEntity) {
//	    try {
//	    	ReimbursementEntity sumbitReimbursement = new ReimbursementEntity();
//	      return new ResponseEntity<>(sumbitReimbursement, HttpStatus.CREATED);
//	    } catch (Exception e) {
//	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//	    }
//	  }
	

//	
	
	
	
	
	
	
	
	
	
	
	
	
	
 	
 	}





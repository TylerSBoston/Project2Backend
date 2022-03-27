package com.Project2Backend.controller;


import java.util.List;
import java.util.NoSuchElementException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;






import com.Project2Backend.dao.EmployeeDao;


import com.Project2Backend.entities.EmployeeEntity;
import com.Project2Backend.entities.ReimbursementEntity;
import com.Project2Backend.exceptions.ReimbursementNotFoundException;
import com.Project2Backend.exceptions.SystemException;

import com.Project2Backend.service.ReimbursementService;

@RestController
@RequestMapping("api")
public class ReimbursementController {
	
	@Autowired
	ReimbursementService reimbursementService;
	@Autowired
	EmployeeDao employeeDao;
	
	
	//INSERT NEW REIMBURSEMENT
	@PostMapping(value = "/reimbursements")
	@ResponseStatus(HttpStatus.CREATED)
	public ReimbursementEntity submitRequest(@RequestBody ReimbursementEntity reimbursementEntity)throws SystemException, ReimbursementNotFoundException {
				return reimbursementService.addReimbursement(reimbursementEntity);
			
	}
	
	//FETCH ALL REIMBURSEMENTS
	@GetMapping(value = "/reimbursements")
	public List<ReimbursementEntity> findAllReimbursements()throws SystemException {
		return reimbursementService.findAllReimbursements();
	
	}
	
	//FIND SINGLE REIMBURSEMENT BY ID
	@GetMapping(value = "/reimbursements/{reimbursementId}")
	public ReimbursementEntity fetchARequest(@PathVariable("reimbursementId") int reimbursementId)throws SystemException {
		// TODO Auto-generated method stub
		return reimbursementService.findById(reimbursementId);
	}
	

	
	@PutMapping(value = "/reimbursements")
	public ResponseEntity<String> updateRequest(@RequestBody ReimbursementEntity reimbursementEntity)throws SystemException {
		try {
			reimbursementService.updateRequest(reimbursementEntity);
			return new ResponseEntity<String>(HttpStatus.OK);
		}catch(NoSuchElementException ex) {
			//LOG ERROR MESSAGE
			System.out.println(ex.getMessage());
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		}
	
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





package com.Project2Backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.core.EntityMetadata;
import org.springframework.data.repository.core.RepositoryMetadata;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

import net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner;

import com.Project2Backend.dao.ReimbursementDao;
import com.Project2Backend.entities.ReimbursementEntity;
import com.Project2Backend.exceptions.EmployeeNotFound;
import com.Project2Backend.exceptions.ReimbursementNotFoundException;
import com.Project2Backend.exceptions.SystemException;

@RestController
@CrossOrigin
@RequestMapping("api")
public class ReimbursementController {
	@Autowired
	EmployeeServiceImpl employeeService;
	@Autowired
	ReimbursementDao reimbursementDao;
	
	
	@GetMapping(value = "reimbursements")
	public List<ReimbursementEntity> findAll(){
		return reimbursementDao.findAll();
	
	}
	
	@GetMapping(value = "reimbursements/{reimbursementId}")
	public Optional<ReimbursementEntity> fetchARequest(@PathVariable("reimbursementId") int reimbursementId) throws SystemException {
		// TODO Auto-generated method stub
		return reimbursementDao.findById(reimbursementId);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@GetMapping("employees")
	public List<Employee> fetchAllEmployees() throws SystemException, EmployeeNotFound {
		// TODO Auto-generated method stub
		return employeeService.fetchAllEmployees();
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

	
//	@GetMapping("reimbursements/{reimbursementId}")
//	public Reimbursement fetchARequest(@PathVariable("reimbursementId") int reimbursementId) throws SystemException {
//		// TODO Auto-generated method stub
//		return employeeService.fetchARequest(reimbursementId);
//	}
	
	@GetMapping("employees/{employeeId}")
	public Employee fetchAEmployee(@PathVariable("employeeId") int employeeId) throws SystemException {
		// TODO Auto-generated method stub
		return employeeService.fetchAEmployee(employeeId);
	}
	
	@PutMapping("employees")
	public Employee updateEmployee(Employee employee) throws SystemException {
		// TODO Auto-generated method stub
		return employeeService.updateEmployee(employee);
	}
	
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





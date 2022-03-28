package com.Project2Backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.Project2Backend.entities.EmployeeEntity;

import com.Project2Backend.exceptions.EmployeeNotFound;
import com.Project2Backend.exceptions.SystemException;
import com.Project2Backend.service.EmployeeServiceImpl;


@RestController
@RequestMapping("/api")
public class EmployeeController {
		
		EmployeeServiceImpl employeeServiceImpl;
		@Autowired
		public EmployeeController(EmployeeServiceImpl employeeServiceImpl) {
			this.employeeServiceImpl = employeeServiceImpl;
		}
		
		//FETCH ALL REIMBURSEMENTS
			@GetMapping(value = "/employees")
			public List<EmployeeEntity> getAllEmployees() {
				return employeeServiceImpl.getAllEmployees();
			
			}
			
			//FIND SINGLE REIMBURSEMENT BY ID
			//ComeBack to
			@GetMapping(value = "/employees/{employeeId}")
			public EmployeeEntity findById(@PathVariable("employeeId")  int employeeId) {
				
				EmployeeEntity employeeEntity = null;
				try {
					employeeEntity = employeeServiceImpl.findById(employeeId)
							.orElseThrow(()->new EmployeeNotFound("Not Found"+employeeId+"Not found"));
				} catch (EmployeeNotFound e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				return employeeEntity;
				
				
			}
			
			@PutMapping(value = "/employees/update")
			public EmployeeEntity updateReimbursement(@RequestBody EmployeeEntity employeeEntity)
				 throws SystemException{
				return employeeServiceImpl.save(employeeEntity);
			
			}
			
			
			
		
//			@PutMapping(value = "/employees{employeeId}")
//			public EmployeeEntity updateEmployee(@PathVariable("employeeId")
//				int employeeId, @Validated @RequestBody EmployeeEntity newEmployee){
//				
//			EmployeeEntity emp = null;
//				try {
//					emp = employeeServiceImpl.findById(employeeId)
//							.orElseThrow(()-> new EmployeeNotFound());
//				} catch (EmployeeNotFound e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				
//				emp.setEmployeeId(newEmployee.getEmployeeId());
//				emp.setJobTitle(newEmployee.getJobTitle());
//				emp.setFirstName(newEmployee.getFirstName());
//				emp.setLastName(newEmployee.getLastName());
//				emp.setEmail(newEmployee.getEmail());
//				emp.setPhone(newEmployee.getPhone());
//				emp.setUserName(newEmployee.getUserName());
//				emp.setPassword(newEmployee.getPassword());
//				return employeeServiceImpl.save(emp);
//				
//				
//			}
	 	
	 	}
	
	
	
	



package com.Project2Backend.service;

import java.util.List;

import java.util.Optional;

import com.Project2Backend.entities.EmployeeEntity;


public interface EmployeeService {
	
	List<EmployeeEntity> getAllEmployees();
	
	Optional<EmployeeEntity> findById(int employeeId);

	EmployeeEntity save(EmployeeEntity employeeEntity);
	
	EmployeeEntity updateEmployee(EmployeeEntity employeeEntity);

}

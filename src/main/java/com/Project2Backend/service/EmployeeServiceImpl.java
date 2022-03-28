package com.Project2Backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project2Backend.dao.EmployeeDao;
import com.Project2Backend.entities.EmployeeEntity;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeDao employeeDao;
	
	@Autowired 
	public EmployeeServiceImpl(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	

	@Override
	public List<EmployeeEntity> getAllEmployees() {
		return employeeDao.findAll();
	}

	@Override
	public Optional<EmployeeEntity> findById(int employeeId) {
		return employeeDao.findById(employeeId);
	}

	@Override
	public EmployeeEntity save(EmployeeEntity employeeEntity) {
		return employeeDao.save(employeeEntity);
	}



	@Override
	public EmployeeEntity updateEmployee(EmployeeEntity employeeEntity) {
		// TODO Auto-generated method stub
		return employeeDao.save(employeeEntity);
	}
	
	
	
	
	
	

}

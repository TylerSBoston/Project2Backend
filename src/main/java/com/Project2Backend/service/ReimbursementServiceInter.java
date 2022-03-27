package com.Project2Backend.service;


import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.Project2Backend.entities.ReimbursementEntity;
import com.Project2Backend.exceptions.SystemException;
import com.Project2Backend.pojo.Employee;
import com.Project2Backend.pojo.Reimbursement;

public interface ReimbursementServiceInter {
	
	ReimbursementEntity submitRequest(@RequestBody ReimbursementEntity reimbursementEntity) throws SystemException;

	List<Reimbursement> findAll() throws javax.transaction.SystemException;

	List<Employee> findAll1() throws javax.transaction.SystemException;

	

	Employee updateEmployee(Employee employee) throws javax.transaction.SystemException;


	

	Reimbursement updateRequest(Reimbursement reimbursement) throws javax.transaction.SystemException;

}

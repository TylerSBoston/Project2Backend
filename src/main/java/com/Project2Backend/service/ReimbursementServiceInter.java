package com.Project2Backend.service;

import java.util.ArrayList;
import java.util.LinkedList;
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

	ReimbursementEntity updateRequest(@RequestBody ReimbursementEntity reimbursementEntity, int reibursementId);

}

package com.Project2Backend.service;

import java.util.List;

import com.Project2Backend.entities.ReimbursementEntity;
import com.Project2Backend.exceptions.SystemException;
import com.Project2Backend.pojo.Employee;
import com.Project2Backend.pojo.Reimbursement;

public interface ReimbursementServiceInter {
	
	ReimbursementEntity submitRequest(ReimbursementEntity reimbursementEntity) throws SystemException;

	List<Reimbursement> findAll() throws javax.transaction.SystemException;

	List<Employee> findAll1() throws javax.transaction.SystemException;

	

	Employee updateEmployee(Employee employee) throws javax.transaction.SystemException;

	ReimbursementEntity updateRequest(ReimbursementEntity reimbursementEntity, int reibursementId);

}

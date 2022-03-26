package com.Project2Backend.service;

import java.util.LinkedList;
import java.util.List;

import javax.transaction.SystemException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project2Backend.dao.EmployeeDao;
import com.Project2Backend.dao.ReimbursementDao;
import com.Project2Backend.entities.EmployeeEntity;
import com.Project2Backend.entities.ReimbursementEntity;
import com.Project2Backend.pojo.Employee;
import com.Project2Backend.pojo.Reimbursement;


@Service
public class ReimbursementService {
	
	@Autowired
	EmployeeDao employeeDao;
	
	@Autowired
	ReimbursementDao reimbursementDao;
	
	public List<Reimbursement> findAll() throws SystemException
	{
		

			LinkedList<Reimbursement> reimbursments = new LinkedList<Reimbursement>();
			for(ReimbursementEntity reimbursement : reimbursementDao.findAll())
			{
				Reimbursement input = new Reimbursement(reimbursement);
				
				input.setEmployee("name");
				
				reimbursments.add(new Reimbursement(reimbursement));
			}
			
			
			return reimbursments;

	}
	
	public List<Employee> findAll1() throws SystemException
	{
		

			LinkedList<Employee> employees = new LinkedList<Employee>();
			for(EmployeeEntity employee : employeeDao.findAll())
			{
				
				employees.add(new Employee(employee));
			}
			
			
			return employees;

	}
	
	

}

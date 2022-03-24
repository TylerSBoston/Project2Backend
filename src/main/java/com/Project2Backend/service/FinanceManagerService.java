package com.Project2Backend.service;

import java.util.LinkedList;

import java.util.List;

import javax.transaction.SystemException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project2Backend.dao.EmployeeDao;
import com.Project2Backend.dao.ReimbursementDao;
//import com.Project2Backend.dao.FinanceManagerDao;
import com.Project2Backend.entities.EmployeeEntity;
import com.Project2Backend.entities.ReimbursementEntity;
import com.Project2Backend.pojo.Employee;
import com.Project2Backend.pojo.Reimbursement;
import com.Project2Backend.service.FinanceManagerService;

@Service
public class FinanceManagerService {

	@Autowired
	EmployeeDao employeeDao;
	
	@Autowired
	ReimbursementDao reimbursementDao;
	
	//private final static Logger log = LogManager.getLogger(FinanceManagerService.class);
	
	public LinkedList<Reimbursement> getPendingReimbursements() throws SystemException
	{
		
			LinkedList<Reimbursement> reimbursements = new LinkedList<Reimbursement>();
			
			// have to do this here,should be easier with spring, trust id to spot-1 is accurate until hibernate added.
			
			List<EmployeeEntity> employees = employeeDao.findAll();
			
			// transfer entity to pojo, can be replaced with @manytoone/manytomany/onetomany 
			for(ReimbursementEntity reimbursement : reimbursementDao.findPending())
			{
				Reimbursement input = new Reimbursement(reimbursement);
				input.setEmployee(employees.get(reimbursement.getEmployeeId()-1).getFirstName() + " " + employees.get(reimbursement.getEmployeeId()-1).getFirstName());
				
				reimbursements.add(new Reimbursement(reimbursement));
				
			}
			
			return reimbursements;

		
	}
	public LinkedList<Reimbursement> getCompletedReimbursements() throws SystemException
	{
		

			List<EmployeeEntity> employees = employeeDao.findAll();
			LinkedList<Reimbursement> reimbursements = new LinkedList<Reimbursement>();
			for(ReimbursementEntity reimbursement : reimbursementDao.findCompleted())
			{
				Reimbursement input = new Reimbursement(reimbursement);
				input.setEmployee(employees.get(reimbursement.getEmployeeId()-1).getFirstName() + " " + employees.get(reimbursement.getEmployeeId()-1).getFirstName());
				
				reimbursements.add(new Reimbursement(reimbursement));
			}
			
			return reimbursements;

		
	}
	public LinkedList<Reimbursement> getAllReimbursements() throws SystemException
	{
		
		

			List<EmployeeEntity> employees = employeeDao.findAll();
			LinkedList<Reimbursement> reimbursements = new LinkedList<Reimbursement>();
			for(ReimbursementEntity reimbursement : reimbursementDao.findAll())
			{
				Reimbursement input = new Reimbursement(reimbursement);
				input.setEmployee(employees.get(reimbursement.getEmployeeId()-1).getFirstName() + " " + employees.get(reimbursement.getEmployeeId()-1).getFirstName());
				
				reimbursements.add(new Reimbursement(reimbursement));
			}
			
			return reimbursements;

		
	}
	public LinkedList<Reimbursement> getEmployeeReimbursements(int employee) throws SystemException
	{
		

			List<EmployeeEntity> employees = employeeDao.findAll();
			LinkedList<Reimbursement> reimbursements = new LinkedList<Reimbursement>();
			for(ReimbursementEntity reimbursement : reimbursementDao.findByEmployeeId(employee))
			{
				Reimbursement input = new Reimbursement(reimbursement);
				input.setEmployee(employees.get(1).getFirstName());
				
				reimbursements.add(new Reimbursement(reimbursement));
			}
			
			return reimbursements;

		
	}
	public List<Employee> getAllEmployees() throws SystemException
	{
		

			LinkedList<Employee> employees = new LinkedList<Employee>();
			for(EmployeeEntity employee : employeeDao.findAll())
			{
				employees.add(new Employee(employee));
			}
			
			
			return employees;

	}
	public Reimbursement updateReimbursement(Reimbursement rUpdate) throws SystemException
	{
			
			// convers reimbursmenent to entity, and back for return
			return new Reimbursement(reimbursementDao.save(new ReimbursementEntity(rUpdate)));

	}
	
}

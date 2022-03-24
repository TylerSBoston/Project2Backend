package com.Project2Backend.service;






import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.Project2Backend.dao.EmployeeDao;
import com.Project2Backend.dao.ReimbursementDao;
import com.Project2Backend.entities.EmployeeEntity;
import com.Project2Backend.entities.ReimbursementEntity;
import com.Project2Backend.pojo.Employee;
import com.Project2Backend.pojo.Reimbursement;


import exceptions.ReimbursementNotFoundException;
import exceptions.SystemException;



public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDao employeeDao;
	
	public EmployeeServiceImpl() {
//		employeeDao = new EmployeeHibernateDaoImpl();
		//commented out bc of autowiring
	}

	@Override
	public List<Reimbursement> fetchAllReimbursements() throws SystemException, ReimbursementNotFoundException {
		List<Reimbursement> allReimbursement = new ArrayList<Reimbursement>();
		List<ReimbursementEntity> allReimbursementEntity = employeeDao.findAll();
		for(ReimbursementEntity reimbursementEntity: allReimbursementEntity) {
			Reimbursement reimbursement = new Reimbursement(
	 				reimbursementEntity.getReimbursementId(),
					reimbursementEntity.getEmployeeId(),
					reimbursementEntity.getStatusId(),
					reimbursementEntity.getDateOfTransaction(),
					reimbursementEntity.getDateSubmitted(),
					reimbursementEntity.getDetails(),
					reimbursementEntity.getAmount(),
					reimbursementEntity.getMerchant(),
					reimbursementEntity.getStatus(),
					reimbursementEntity.getExpenseType());
			allReimbursement.add(reimbursement);}
		return allReimbursement;
		
		
	}

	@Override
	public Reimbursement submitRequest(Reimbursement reimbursement) throws SystemException {
		ReimbursementEntity reimbursementEntity = new ReimbursementEntity(
				reimbursement.getReimbursementId(),
				reimbursement.getEmployeeId(),
				reimbursement.getStatusId(),
				reimbursement.getDateOfTransaction(),
				reimbursement.getDateSubmitted(),
				reimbursement.getAmount(),
				reimbursement.getDetails(),
				reimbursement.getMerchant(),
				reimbursement.getStatus(),
				reimbursement.getExpenseType());
		 	employeeDao.saveAndFlush(reimbursementEntity);
		 		reimbursement = new Reimbursement(
		 				reimbursementEntity.getReimbursementId(),
						reimbursementEntity.getEmployeeId(),
						reimbursementEntity.getStatusId(),
						reimbursementEntity.getDateOfTransaction(),
						reimbursementEntity.getDateSubmitted(),
						reimbursementEntity.getDetails(),
						reimbursementEntity.getAmount(),
						reimbursementEntity.getMerchant(),
						reimbursementEntity.getStatus(),
						reimbursementEntity.getExpenseType());
		 		return reimbursement;
		 				
	}

	@Override
	public Reimbursement updateReimbursement(Reimbursement reimbursement) throws SystemException {
		ReimbursementEntity reimbursementEntity = new ReimbursementEntity(
				reimbursement.getReimbursementId(),
				reimbursement.getEmployeeId(),
				reimbursement.getStatusId(),
				reimbursement.getDateOfTransaction(),
				reimbursement.getDateSubmitted(),
				reimbursement.getAmount(),
				reimbursement.getDetails(),
				reimbursement.getMerchant(),
				reimbursement.getStatus(),
				reimbursement.getExpenseType());
		 employeeDao.save(reimbursementEntity);
		 reimbursement = new Reimbursement(
					reimbursementEntity.getReimbursementId(),
					reimbursementEntity.getEmployeeId(),
					reimbursementEntity.getStatusId(),
					reimbursementEntity.getDateOfTransaction(),
					reimbursementEntity.getDateSubmitted(),
					reimbursementEntity.getDetails(),
					reimbursementEntity.getAmount(),
					reimbursementEntity.getMerchant(),
					reimbursementEntity.getStatus(),
					reimbursementEntity.getExpenseType());
		 
		 return reimbursement;}
			
	

	
	@Override
	public Reimbursement fetchARequest(int employeeId) throws SystemException {
		Optional<ReimbursementEntity> optional = employeeDao.findById(employeeId);
		Reimbursement reimbursement= null;
		if(optional.isPresent()) {
		
		 ReimbursementEntity reimbursementEntity = optional.get();
		 reimbursement = new Reimbursement(
				reimbursementEntity.getReimbursementId(),
				reimbursementEntity.getEmployeeId(),
				reimbursementEntity.getStatusId(),
				reimbursementEntity.getDateOfTransaction(),
				reimbursementEntity.getDateSubmitted(),
				reimbursementEntity.getDetails(),
				reimbursementEntity.getAmount(),
				reimbursementEntity.getMerchant(),
				reimbursementEntity.getStatus(),
				reimbursementEntity.getExpenseType());}
		
		return reimbursement;
	
	}

	

	@Override
	public Employee updateEmployee(Employee employee) throws SystemException {
		EmployeeEntity employeeEntity = new EmployeeEntity(
				employee.getEmployeeId(),
				employee.getFirstName(),
				employee.getFirstName(),
				employee.getLastName(),
				employee.getEmail(),
				employee.getPhone(),
				employee.getUserName(),
				employee.getPassword());
		 employeeDao.save(employeeEntity);
		 employee = new Employee(
					employeeEntity.getEmployeeId(),
					employeeEntity.getFirstName(),
					employeeEntity.getFirstName(),
					employeeEntity.getLastName(),
					employeeEntity.getEmail(),
					employeeEntity.getPhone(),
					employeeEntity.getUserName(),
					employeeEntity.getPassword());
		 
		 return employee;
				 
	}
	
	

}

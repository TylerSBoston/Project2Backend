package com.Project2Backend.service;






import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project2Backend.dao.EmployeeDao;
import com.Project2Backend.dao.ReimbursementDao;
import com.Project2Backend.entities.EmployeeEntity;
import com.Project2Backend.entities.ReimbursementEntity;
import com.Project2Backend.pojo.Employee;
import com.Project2Backend.pojo.Reimbursement;
import com.Project2Backend.exceptions.EmployeeNotFound;
import com.Project2Backend.exceptions.ReimbursementNotFoundException;
import com.Project2Backend.exceptions.SystemException;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDao employeeDao;
	
	@Autowired
	ReimbursementDao reimbursementDao;
	
	public EmployeeServiceImpl() {
//		employeeDao = new EmployeeHibernateDaoImpl();
		//commented out bc of autowiring
	}

	@Override
	public List<Reimbursement> fetchAllReimbursements() throws SystemException, ReimbursementNotFoundException {
		List<Reimbursement> allReimbursement = new ArrayList<Reimbursement>();
		List<ReimbursementEntity> allReimbursementEntity = reimbursementDao.findAll();
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
	public List<Employee> fetchAllEmployees() throws SystemException, EmployeeNotFound
	{
		

			LinkedList<Employee> employees = new LinkedList<Employee>();
			for(EmployeeEntity employee : employeeDao.findAll())
			{
				employees.add(new Employee(employee));
			}
			
			
			return employees;

	}


	   @Override
	    public Reimbursement submitRequest(Reimbursement reimbursement)throws SystemException {
	        ReimbursementEntity reimbursementEntity = new ReimbursementEntity(reimbursement.getReimbursementId(),
					reimbursement.getEmployeeId(),
					reimbursement.getStatusId(),
					reimbursement.getDateOfTransaction(),
					reimbursement.getDateSubmitted(),
					reimbursement.getAmount(),
					reimbursement.getDetails(),
					reimbursement.getMerchant(),
					reimbursement.getStatus(),
					reimbursement.getExpenseType());
	        reimbursementDao.saveAndFlush(reimbursementEntity);
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
		 reimbursementDao.save(reimbursementEntity);
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
	public Reimbursement fetchARequest(int reimbursementId) throws SystemException {
		Optional<ReimbursementEntity> optional = reimbursementDao.findById(reimbursementId);
		
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

	public Employee fetchAEmployee(int employeeId) throws SystemException{
		

Optional<EmployeeEntity> optional = employeeDao.findById(employeeId);
		
		Employee employee= null;
		if(optional.isPresent()) {
		
		 EmployeeEntity employeeEntity = optional.get();
		 employee = new Employee(
				 employeeEntity.getEmployeeId(),
					employeeEntity.getFirstName(),
					employeeEntity.getFirstName(),
					employeeEntity.getLastName(),
					employeeEntity.getEmail(),
					employeeEntity.getPhone(),
					employeeEntity.getUserName(),
					employeeEntity.getPassword());}
		
		return employee;
	
		
		
		
	}
	
	

}

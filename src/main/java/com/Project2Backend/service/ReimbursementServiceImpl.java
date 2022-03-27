package com.Project2Backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project2Backend.dao.EmployeeDao;
import com.Project2Backend.dao.ReimbursementDao;
import com.Project2Backend.entities.EmployeeEntity;
import com.Project2Backend.entities.ReimbursementEntity;
import com.Project2Backend.exceptions.SystemException;




@Service
public class ReimbursementServiceImpl implements ReimbursementService {
	//HERE WE CALL METHODS FROM THE REPSOSITORY< THE REPOSITORY IS AUTOWIRED
	@Autowired
	ReimbursementDao reimbursementDao;
	@Autowired 
	EmployeeDao employeeDao;
	


	
	@Override
	public ReimbursementEntity submitRequest(ReimbursementEntity reimbursementEntity) {
		// 
		return reimbursementDao.save(reimbursementEntity);
	}

	@Override
	public List<ReimbursementEntity> findAllReimbursements() {
		return reimbursementDao.findAll();
	}
	
	@Override
	public List<EmployeeEntity> findAll1() {
		// TODO Auto-generated method stub
		return employeeDao.findAll();
	}
	
	@Override
	public EmployeeEntity updateEmployee(EmployeeEntity employeeEntity) {
		
		EmployeeEntity employeeDB = employeeDao.findById(employeeEntity.getEmployeeId()
				).orElseThrow();
		return employeeDao.save(employeeEntity);
	}
	
	@Override
	public EmployeeEntity findById(int employeeId) {
		return employeeDao.findById(employeeId).get();
	}

	@Override
	public ReimbursementEntity findById1(int  reimbursementId) {
		return reimbursementDao.findById(reimbursementId).get();
	}

	@Override
	public ReimbursementEntity updateRequest(ReimbursementEntity reimbursementEntity) {
		// Check if REIMBURSEMENT WITH ID EXISTS
		ReimbursementEntity reimbursementDB = reimbursementDao.findById(reimbursementEntity.getReimbursementId()
				).orElseThrow();
		return reimbursementDao.save(reimbursementEntity);
	}
	
	@Override
	public ReimbursementEntity fetchaRequest(int reimbursementId)  {
		// TODO Auto-generated method stub
		return reimbursementDao.findById(reimbursementId).get();
	}



	@Override
	public Optional<EmployeeEntity> fetchAEmployee(int employeeId) {
		
		return employeeDao.findById(employeeId);
	}

	

}

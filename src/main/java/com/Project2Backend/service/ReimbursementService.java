package com.Project2Backend.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project2Backend.dao.JpaReimbursementInterface;
import com.Project2Backend.dao.ReimbursementDao;
import com.Project2Backend.entities.ReimbursementEntity;

@Service
public class ReimbursementService {
	
	
	@Autowired
	JpaReimbursementInterface jpaReimbursementInterface;
	
	public List<ReimbursementEntity> reimsfindAll() {
		
		List<ReimbursementEntity> reimsList = jpaReimbursementInterface.findAll();
		
		return reimsList;
	}
	
	public ReimbursementEntity submitRequest(ReimbursementEntity reimbursementEntity) {
//		reimbursementEntity = jpaReimbursementInterface.save(reimbursementEntity);
		ReimbursementEntity reim = ReimbursementEntity.builder()
				.employeeId(0)
				.statusId(0)
				.status("")
				.expenseType("")
				.dateOfTransaction("")
				.dateSubmitted("")
				.amount(null)
				.details("")
				.merchant("")
				.build();				
		return jpaReimbursementInterface.save(reim);
	}
	
	
	public Optional<ReimbursementEntity> fetchARequest
	(int reimbursementId) {
		return jpaReimbursementInterface.findById(reimbursementId);
	}
	
	public ReimbursementEntity updateRequest(ReimbursementEntity reimbursementEntity) {
		return jpaReimbursementInterface.save(reimbursementEntity);
	}
	
	

}

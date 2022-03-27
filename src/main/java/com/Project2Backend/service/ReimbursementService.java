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
	private JpaReimbursementInterface jpaReimbursementInterface;
	
	public List<ReimbursementEntity> findAll(){
		
		List<ReimbursementEntity> reims = new ArrayList<>();
		
		jpaReimbursementInterface.findAll().forEach(reims::add);
		
		return reims;
	}
	
	public ReimbursementEntity submitRequest(ReimbursementEntity reimbursementEntity) {
		return jpaReimbursementInterface.save(reimbursementEntity);
	}
	
	public Optional<ReimbursementEntity> fetchARequest
	(int reimbursementId) {
		return jpaReimbursementInterface.findById(reimbursementId);
	}
	
	public ReimbursementEntity updateRequest(ReimbursementEntity reimbursementEntity) {
		return jpaReimbursementInterface.save(reimbursementEntity);
	}
	
	

}

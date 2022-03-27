package com.Project2Backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project2Backend.entities.ReimbursementEntity;
import com.Project2Backend.repository.ReimbursementRepository;
@Service
public class ReimbursementServiceImpl implements ReimbursementService {
	//HERE WE CALL METHODS FROM THE REPSOSITORY< THE REPOSITORY IS AUTOWIRED
	@Autowired
	ReimbursementRepository reimbursementRepository;

	@Override
	public ReimbursementEntity addReimbursement(ReimbursementEntity reimbursementEntity) {
		return reimbursementRepository.save(reimbursementEntity);
	}

	@Override
	public List<ReimbursementEntity> findAllReimbursements() {
		return reimbursementRepository.findAll();
	}

	@Override
	public ReimbursementEntity findById(int reimbursementId) {
		return reimbursementRepository.findById(reimbursementId).get();
	}

	@Override
	public void updateRequest(ReimbursementEntity reimbursementEntity) {
		// Check if REIMBURSEMENT WITH ID EXISTS
		ReimbursementEntity reimbursementDB = reimbursementRepository.findById(reimbursementEntity.getReimbursementId()
				).orElseThrow();
		//IF USER EXISTS UPDATE
		reimbursementRepository.save(reimbursementEntity);
		
	}

}

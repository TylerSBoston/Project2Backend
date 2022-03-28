package com.Project2Backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Project2Backend.dao.ReimbursementDao;
import com.Project2Backend.entities.ReimbursementEntity;

@Service
@Transactional
public class ReimbursementServiceImpl implements ReimbursementService {
	
	  ReimbursementDao reimbursementDao;
	  
       @Autowired
       public ReimbursementServiceImpl(ReimbursementDao reimbursementDao) {
           this.reimbursementDao = reimbursementDao;
           }

	@Override
	public List<ReimbursementEntity> getAllReimbursements() {
		// TODO Auto-generated method stub
		return reimbursementDao.findAll();
	}

	@Override
	public Optional<ReimbursementEntity> findById(int ReimbursementId) {
		// TODO Auto-generated method stub
		return reimbursementDao.findById(ReimbursementId);
	}

	@Override
	public ReimbursementEntity updateReimbursement(ReimbursementEntity reimbursementEntity) {
		// TODO Auto-generated method stub
		return reimbursementDao.save(reimbursementEntity);
	}
	
//	@Override
//	public ReimbursementEntity addReimbursement(ReimbursementEntity reimbursementEntity) {
//		// TODO Auto-generated method stub
//		return reimbursementDao.save(reimbursementEntity);
//	}

	@Override
	public void save(ReimbursementEntity reimbursementEntity) {
		// TODO Auto-generated method stub
		reimbursementDao.save(reimbursementEntity);
	}
	
	@Override
	public ReimbursementEntity save1(ReimbursementEntity reimbursementEntity) {
		return reimbursementDao.save(reimbursementEntity);
	}

	public ReimbursementEntity get(Integer reimbursementId) {
		// TODO Auto-generated method stub
		return null;
	}

}

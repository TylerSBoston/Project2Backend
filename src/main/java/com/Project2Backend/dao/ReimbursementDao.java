package com.Project2Backend.dao;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.Project2Backend.entities.ReimbursementEntity;
import com.Project2Backend.exceptions.SystemException;
import com.Project2Backend.pojo.Reimbursement;

@Repository
public interface ReimbursementDao extends JpaRepository<ReimbursementEntity, Integer> {
	
	//needs changes for all completed and incompleted values if any are added
	@Query("Select u from ReimbursementEntity u where statusId < 4")
	List<ReimbursementEntity> findPending();
	
	List<ReimbursementEntity> findByReimbursementId(int reimbursementId);

	@Query("Select u from ReimbursementEntity u where statusId > 3")
	List<ReimbursementEntity> findCompleted();

	@SuppressWarnings("unchecked")
	ReimbursementEntity save(ReimbursementEntity reimbursementEntity);
	
	Optional<ReimbursementEntity> findById(int reimbursementId);
	
	

	
	
	
	
}

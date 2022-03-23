package com.Project2Backend.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.Project2Backend.entities.ReimbursementEntity;

@Repository
public interface ReimbursementDao extends JpaRepository<ReimbursementEntity, Integer> {
	
	//needs changes for all completed and incompleted values if any are added
	@Query("Select u from ReimbursementEntity u where statusID < 4")
	List<ReimbursementEntity> findPending();
	
	List<ReimbursementEntity> findByEmployeeID(int employeeID);

	@Query("Select u from ReimbursementEntity u where statusID > 3")
	List<ReimbursementEntity> findCompleted();
	
	
	
}

package com.Project2Backend.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Project2Backend.entities.ImageEntity;
import com.Project2Backend.entities.RoleEntity;

@Repository
public interface ImageDao extends JpaRepository<ImageEntity, Integer> {
	
	
	@Query("select u from ImageEntity u where reimbursement_id = ?1")
	ImageEntity findByReimbursementID(int reimbursement);
	
}
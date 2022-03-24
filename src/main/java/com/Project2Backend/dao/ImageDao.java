package com.Project2Backend.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Project2Backend.entities.ImageEntity;
import com.Project2Backend.entities.ReimbursementEntity;

@Repository
public interface ImageDao extends JpaRepository<ImageEntity, Integer> {
	
	Optional<ImageEntity> findById(int ImageId);
	
	
	Optional<ImageEntity> findByReimbursementId(int reimbursementId);
	
}

package com.Project2Backend.dao;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Project2Backend.entities.ImageEntity;
import com.Project2Backend.entities.ReimbursementEntity;

@Repository
public interface ImageDao extends JpaRepository<ImageEntity, Integer> {
	
	@Transactional
	Optional<ImageEntity> findById(int ImageId);
	
	@Transactional
	@Query("select u from ImageEntity u where u.reimbursementId =  ?1")
	Optional<ImageEntity> findByReimbursementId(int reimbursementId);
	
}

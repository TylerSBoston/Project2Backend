package com.Project2Backend.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.Project2Backend.entities.ReimbursementEntity;
@Component
public interface JpaReimbursementInterface extends 
JpaRepository<ReimbursementEntity, Integer> {
	
	
	Optional<ReimbursementEntity> findById(ReimbursementEntity reimbursementEntity);

}

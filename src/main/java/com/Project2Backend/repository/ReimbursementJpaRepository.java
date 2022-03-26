package com.Project2Backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.Project2Backend.entities.ReimbursementEntity;

@Component
public interface ReimbursementJpaRepository extends JpaRepository<ReimbursementEntity, Integer> {
	
	

}

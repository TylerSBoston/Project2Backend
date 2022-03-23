package com.Project2Backend.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Project2Backend.entities.RoleEntity;

@Repository
public interface RoleDao extends JpaRepository<RoleEntity, Integer> {
	
	@Query("select u from RoleEntity u where employee_id = ?1")
	List<RoleEntity> findByEmployeeID(int employeeid);
	
	
	
}


package com.Project2Backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Project2Backend.entities.EmployeeEntity;
import com.Project2Backend.pojo.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<EmployeeEntity, Integer> {

	
	
	@Query(value = "select u from EmployeeEntity u where u.userName = ?1 and ?2 = u.password",nativeQuery = true)
	Employee login(String username, String password);
	
	

}

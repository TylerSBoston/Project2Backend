package com.Project2Backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Project2Backend.entities.EmployeeEntity;
import com.Project2Backend.pojo.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<EmployeeEntity, Integer> {

	
	
	@Query("select u from EmployeeEntity u where ?1.userName = u.userName and ?1.password = u.password")
	Employee login(Employee e);
	
	

}

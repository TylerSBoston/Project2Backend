package com.Project2Backend.dao;



import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Project2Backend.entities.EmployeeEntity;
import com.Project2Backend.exceptions.SystemException;







@Repository
public interface EmployeeDao extends JpaRepository<EmployeeEntity, Integer>  {

	
	
	EmployeeEntity fetchAEmployee(int employeeId);
	
	
	
	EmployeeEntity updateEmployee(EmployeeEntity employeeEntity) throws SystemException;
	
	List<EmployeeEntity> findAll1()throws SystemException;
	
	
	
	@Query(value = "select * from employees where user_name = ?1 and ?2 = user_password",nativeQuery = true)
	EmployeeEntity login(String username, String password);


	
	
	
	
}



	
	


			
			
			

			
			
			

			
			
			
			
			
	
	



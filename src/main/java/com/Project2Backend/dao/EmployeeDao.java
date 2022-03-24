package com.Project2Backend.dao;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Project2Backend.entities.EmployeeEntity;
import com.Project2Backend.entities.ReimbursementEntity;
import com.Project2Backend.pojo.Employee;
import com.Project2Backend.pojo.Reimbursement;






@Repository
public interface EmployeeDao extends JpaRepository<EmployeeEntity, Integer>  {

	Optional<ReimbursementEntity> findById(int employeeId);
	
	@Query(value = "select u from EmployeeEntity u where u.userName = ?1 and ?2 = u.password",nativeQuery = true)
	EmployeeEntity login(String username, String password);
	
	
	
}



	
	


			
			
			

			
			
			

			
			
			
			
			
	
	



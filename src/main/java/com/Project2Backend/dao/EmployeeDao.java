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
public interface EmployeeDao extends JpaRepository<ReimbursementEntity, Reimbursement>  {
	@Query("select u from EmployeeEntity u where ?1.userName = u.userName and ?1.password = u.password")
	Employee login(Employee e);

	void save(EmployeeEntity employeeEntity);

	Optional<ReimbursementEntity> findById(int employeeId);
}



	
	


			
			
			

			
			
			

			
			
			
			
			
	
	



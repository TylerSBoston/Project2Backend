package com.Project2Backend.pojo;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.Project2Backend.entities.EmployeeEntity;
import com.Project2Backend.entities.RoleEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Employee {
	String firstName = "";
	String lastName = "";
	int employeeId = 0;
	String email = "";

	String phone = "";
	String jobTitle = "";
	
	
	
	// leave empty unless except for login
	String userName = "";
	String password = "";
	
	
	List<RoleEntity> roles;
	
	
	public Employee(EmployeeEntity employee)
	{
		firstName = employee.getFirstName();
		lastName = employee.getLastName();
		employeeId = employee.getEmployeeId();
		email = employee.getEmail();
		phone = employee.getPhone();
		jobTitle = employee.getJobTitle();
		//not adding ones for username/password
		
	}
	public Employee(EmployeeEntity employee,List<RoleEntity> roles)
	{
		this(employee);
		this.roles = roles;
		
	}
	

}

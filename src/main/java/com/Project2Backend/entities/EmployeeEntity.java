package com.Project2Backend.entities;








import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.Project2Backend.pojo.Employee;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="employees")
public class EmployeeEntity {
	
	
	public EmployeeEntity(Employee employee) {
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column(name="employee_id")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int employeeId;
	
	@Column(name="job_title")
	private String jobTitle;
	

	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="user_password")
	private String password;
	
	
	
}
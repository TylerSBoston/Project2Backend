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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity
@Getter
@Setter
@Accessors(chain=true)

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

	public EmployeeEntity(String jobTitle, String firstName, String lastName, String email, String phone,
			String userName, String password) {
		super();
		this.jobTitle = jobTitle;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.userName = userName;
		this.password = password;
	}
	
	
	
	
	
}
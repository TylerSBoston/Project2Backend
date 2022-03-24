package com.Project2Backend.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="employees")
public class EmployeeEntity {
	@Id
	@Column(name="employee_id")
	private int employeeId = 0;
	@Column(name="first_name")
	private String firstName = "";
	@Column(name="last_name")
	private String lastName = "";
	@Column(name="email")
	private String email = "";
	@Column(name="phone")
	private String phone = "";
	@Column(name="job_title")
	private String jobTitle = "";
	// permissions renamed roles so it doesn't match names with other stuff as much
	
	
	// leave empty unless except for login
	@Column(name="user_name")
	private String userName = "";
	@Column(name="user_password")
	private String password = "";
	
	// not enough time to figure this out so done manually later
	/*
	@OneToMany(mappedBy = "reimbursement", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<RoleEntity> roles;
	*/

}
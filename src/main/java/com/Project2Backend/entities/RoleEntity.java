package com.Project2Backend.entities;

import java.math.BigDecimal;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//using a many to many table atm, needs conversion with for @manytomany annotations later
@Table(name="employee_permissions")
public class RoleEntity {
	@Id
	@Column(name = "employee_permission_id")
	private int employeeRoleId = 0;
	@Column(name="permission_id")
	private int roleID = 0;
	@Column(name="permission_type")
	private String role = "";	
	@Column(name="employee_id")
	private int empoyeeId = 0;
}

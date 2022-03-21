package Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

// exists do to role separation in the DB, allows users to have multiple roles, though only 1-2 used
@Entity
@Table(name="employee_permissions")
public class RoleEntity {
	
	@Column(name="permission_id")
	private int roleID = 0;
	@Column(name="permission_type")
	private String role = "";
	@Column(name="employee_id")
	private int employeeID = 0;
	@Column(name="employee_permission_id")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int employeeRoleID = 0;
	
	public int getRoleID() {
		return roleID;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public void setRoleID(int roleID) {
		this.roleID = roleID;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}

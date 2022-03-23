package com.Project2Backend.pojo;

import java.util.LinkedList;


import com.Project2Backend.entities.RoleEntity;




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
	
	
	LinkedList<RoleEntity> roles = new LinkedList<RoleEntity>();
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}






	public Employee(int i, String string, String string2, String string3, String string4, String string5, String string6, String string7)
	{
		
	}
	
	

	
	

	public Employee(String firstName, String lastName, int employeeId, String email, String phone, String jobTitle,
			String userName, String password, LinkedList<RoleEntity> roles) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.email = email;
		this.phone = phone;
		this.jobTitle = jobTitle;
		this.userName = userName;
		this.password = password;
		this.roles = roles;
	}






	public LinkedList<RoleEntity> getRoles() {
		return roles;
	}
	public void setRoles(LinkedList<RoleEntity> roles) {
		this.roles = roles;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
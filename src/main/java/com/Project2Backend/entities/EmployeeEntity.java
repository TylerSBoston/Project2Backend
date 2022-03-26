package com.Project2Backend.entities;





import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.Project2Backend.pojo.Employee;

import lombok.AllArgsConstructor;





@Entity
@Table(name="employees")
public class EmployeeEntity {
	
	
	@Id
	@Column(name="employee_id")
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
	
	
	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	public EmployeeEntity(int employeeId, String jobTitle, String firstName, String lastName, String email,
			String phone, String userName, String password) {
		super();
		this.employeeId = employeeId;
		this.jobTitle = jobTitle;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.userName = userName;
		this.password = password;
	}


	public EmployeeEntity(Employee employee) {
		// TODO Auto-generated constructor stub
	}



	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getJobTitle() {
		return jobTitle;
	}


	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
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


	@Override
	public String toString() {
		return "EmployeeEntity [employeeId=" + employeeId + ", jobTitle=" + jobTitle + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + ", phone=" + phone + ", userName=" + userName
				+ ", password=" + password + "]";
	}
	
	
	
	

	
	
}
package Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;



@Entity
@Table(name="reimbursements")
public class EmployeeEntity {
	@Column(name="first_name")
	private String firstName = "";
	@Column(name="last_name")
	private String lastName = "";
	@Column(name="employee_id")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int employeeID = 0;
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
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
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

package com.Project2Backend.entities;








import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.Project2Backend.pojo.Employee;

import lombok.AllArgsConstructor;
import lombok.Builder;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity
@Getter
@Setter
@Accessors(chain=true)


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="employees")
public class EmployeeEntity {
	
	
	  
	
	
	@Override
	public String toString() {
		return "EmployeeEntity [employeeId=" + employeeId + ", jobTitle=" + jobTitle + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + ", phone=" + phone + ", userName=" + userName
				+ ", password=" + password + "]";
	}


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
	

	@SuppressWarnings("unused")
	@Override
    public boolean equals(Object employeeId) {
        if (this == employeeId)
            return true;
        if (employeeId == null)
            return false;
        if (getClass() != employeeId.getClass())
            return false;
        EmployeeEntity other = (EmployeeEntity) employeeId;
        if (employeeId == null) {
            return false;
        } else if (!employeeId.equals(other.employeeId))
            return false;
        return true;
    }
	
	
	
	
	
}
package com.Project2Backend.entities;

import java.math.BigDecimal;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Project2Backend.pojo.Reimbursement;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@RequestMapping


@Table(name="reimbursements")


public class ReimbursementEntity {
	public ReimbursementEntity( Reimbursement rUpdate) {
		// TODO Auto-generated constructor stub
	}
	

	@Id
	
	@Column(name = "reimbursement_id")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	final int reimbursementId = 0;
	
	@Column(name="employee_id")
	final int employeeId = 0;
	
	@Column(name="status_id")
	final int statusId = 0;
	
	@Column(name="status")
	final String status = "";
	
	@Column(name="reimbursement_type")
	final String expenseType = "";
	
	@Column(name="date_of_transaction")
	private String dateOfTransaction ;
	
	@Column(name="date_of_submission")
	private String dateSubmitted;
	
	@Column(name="amount")
	final BigDecimal amount = BigDecimal.ZERO;
	
	@Column(name="details")
	final String details = "";
	
	@Column(name="merchant")
	final String merchant = "";

	public void setStatus(String status2) {
		// TODO Auto-generated method stub
		
	}

	public ReimbursementEntity( ReimbursementEntity reimbursementEntity) {
		// TODO Auto-generated constructor stub
	}
	
	


	
}



	

	
	
	


	
	
	
	
	
	
	
	

	

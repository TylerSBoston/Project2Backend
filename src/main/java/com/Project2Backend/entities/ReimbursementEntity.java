package com.Project2Backend.entities;

import java.math.BigDecimal;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


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
	private int reimbursementId = 0;
	
	@Column(name="employee_id")
	private int employeeId = 0;
	
	@Column(name="status_id")
	private int statusId = 0;
	
	@Column(name="status")
	private String status = "";
	
	@Column(name="reimbursement_type")
	private String expenseType = "";
	
	@Column(name="date_of_transaction")
	private String dateOfTransaction ;
	
	@Column(name="date_of_submission")
	private String dateSubmitted;
	
	@Column(name="amount")
	private BigDecimal amount = BigDecimal.ZERO;
	
	@Column(name="details")
	private String details = "";
	
	@Column(name="merchant")
	private String merchant = "";


	
	


	
}



	

	
	
	


	
	
	
	
	
	
	
	

	

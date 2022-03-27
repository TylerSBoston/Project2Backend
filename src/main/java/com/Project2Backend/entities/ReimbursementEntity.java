package com.Project2Backend.entities;

import java.math.BigDecimal;





import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
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
@Table(name = "reimbursements")
public class ReimbursementEntity {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "reimbursement_id", nullable = false)
	private int reimbursementId;
	
	@Column(name = "employee_id", nullable = false)
	private int employeeId;
	
	@Column(name="status_id")
	private int statusId;
	
	@Column(name="status")
	private String status;
	
	@Column(name="reimbursement_type", nullable = false)
	private String expenseType;
	
	@Column(name="date_of_transaction", nullable = false)
	private String dateOfTransaction;
	
	@Column(name="date_of_submission")
	private String dateSubmitted;
	
	@Column(name="amount", nullable = false)
	private BigDecimal amount;
	
	@Column(name="details")
	private String details;
	
	@Column(name="merchant", nullable = false)
	private String merchant;

	public ReimbursementEntity(int employeeId, int statusId, String status, String expenseType,
			String dateOfTransaction, String dateSubmitted, BigDecimal amount, String details, String merchant) {
		super();
		this.employeeId = employeeId;
		this.statusId = statusId;
		this.status = status;
		this.expenseType = expenseType;
		this.dateOfTransaction = dateOfTransaction;
		this.dateSubmitted = dateSubmitted;
		this.amount = amount;
		this.details = details;
		this.merchant = merchant;
	}

	public ReimbursementEntity(Reimbursement rUpdate) {
		// TODO Auto-generated constructor stub
	}


}



	

	
	
	


	
	
	
	
	
	
	
	

	

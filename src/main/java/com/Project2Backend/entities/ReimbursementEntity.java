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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;





@Entity
@Getter
@Setter
@Accessors(chain=true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "reimbursements")
public class ReimbursementEntity {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "reimbursement_id")
	private int reimbursementId;
	
	@Column(name = "employee_id")
	private int employeeId;
	
	@Column(name="status_id")
	private int statusId;
	
	@Column(name="status")
	private String status;
	
	@Column(name="reimbursement_type")
	private String expenseType;
	
	@Column(name="date_of_transaction")
	private String dateOfTransaction;
	
	@Column(name="date_of_submission")
	private String dateSubmitted;
	
	@Column(name="amount")
	private BigDecimal amount;
	
	@Column(name="details")
	private String details;
	
	@Column(name="merchant")
	private String merchant;
	
	



	public ReimbursementEntity(Reimbursement rUpdate) {
		// TODO Auto-generated constructor stub
	}






	
	








}



	

	
	
	


	
	
	
	
	
	
	
	

	

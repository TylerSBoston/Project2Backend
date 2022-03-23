package com.Project2Backend.entities;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.Project2Backend.pojo.Reimbursement;

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
@Table(name="reimbursements")
public class ReimbursementEntity {
	@Id
	@Column(name = "reimbursement_id")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int reimbursementID = 0;
	@Column(name="employee_id")
	private int employeeID = 0;
	@Column(name="status_id")
	private int statusID = 0;
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
	@Column(name="status")
	private String status = "";
	@Column(name="reimbursement_type")
	private String expenseType = "";
	
	// one to many/ many to one not included

	public ReimbursementEntity(Reimbursement r) {
		// TODO Auto-generated constructor stub
		reimbursementID = r.getReimbursementID();
		employeeID = r.getEmployeeID();
		statusID = r.getStatusID();
		dateOfTransaction = r.getDateOfTransaction();
		dateSubmitted = r.getDateSubmitted();
		amount = r.getAmount();
		details = r.getDetails();
		merchant = r.getMerchant();
		status = r.getStatus();
		expenseType = r.getExpenseType();
		
	}
	
	
	@Override
	public String toString() {
		return "ReimbursementEntity [reimbursementID=" + reimbursementID + ", employeeID=" + employeeID + ", satustId="
				+ statusID + ", dateOfTransaction=" + dateOfTransaction + ", amount=" + amount
				+ ", details=" + details + ", merchant=" + merchant + "]";
	}




	
	
	
	

}
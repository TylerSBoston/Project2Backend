package com.Project2Backend.entities;

import java.math.BigDecimal;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="reimbursements")
public class ReimbursementEntity {
	@Id
	@Column(name = "reimbursement_id")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int reimbursementId = 0;
	@Column(name="employee_id")
	private int employeeId = 0;
	@Column(name="status_id")
	private int statusId = 0;
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

	public ReimbursementEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReimbursementEntity(int reimbursementId, int employeeId, int statusId, String dateOfTransaction,
			String dateSubmitted, BigDecimal amount, String details, String merchant, String status,
			String expenseType) {
		super();
		this.reimbursementId = reimbursementId;
		this.employeeId = employeeId;
		this.statusId = statusId;
		this.dateOfTransaction = dateOfTransaction;
		this.dateSubmitted = dateSubmitted;
		this.amount = amount;
		this.details = details;
		this.merchant = merchant;
		this.status = status;
		this.expenseType = expenseType;
	}

	public int getReimbursementId() {
		return reimbursementId;
	}

	public void setReimbursementId(int reimbursementId) {
		this.reimbursementId = reimbursementId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public String getDateOfTransaction() {
		return dateOfTransaction;
	}

	public void setDateOfTransaction(String dateOfTransaction) {
		this.dateOfTransaction = dateOfTransaction;
	}

	public String getDateSubmitted() {
		return dateSubmitted;
	}

	public void setDateSubmitted(String dateSubmitted) {
		this.dateSubmitted = dateSubmitted;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getMerchant() {
		return merchant;
	}

	public void setMerchant(String merchant) {
		this.merchant = merchant;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getExpenseType() {
		return expenseType;
	}

	public void setExpenseType(String expenseType) {
		this.expenseType = expenseType;
	}

	@Override
	public String toString() {
		return "ReimbursementEntity [reimbursementId=" + reimbursementId + ", employeeId=" + employeeId + ", statustId="
				+ statusId + ", dateOfTransaction=" + dateOfTransaction + ", dateSubmitted=" + dateSubmitted
				+ ", amount=" + amount + ", details=" + details + ", merchant=" + merchant + ", status=" + status
				+ ", expenseType=" + expenseType + "]";
	}



	
}
	
	
	
	
	
	
	
	

	

package com.Project2Backend.pojo;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import com.Project2Backend.entities.ReceiptEntity;
import com.Project2Backend.entities.ReimbursementEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Reimbursement {
	int reimbursementId = 0;
	int employeeId = 0;
	int statusId = 0;
	
	String status = "";
	String expenseType = "";
	String merchant = "";

	BigDecimal amount = BigDecimal.ZERO;
	String details = "";
	String dateOfTransaction = "";
	String dateSubmitted = "";
	
	// used by manager, not employee view
	String Employee = "";
	


	// still needs value for receipt
	public Reimbursement()
	{
		
	}
	
	public Reimbursement(ReimbursementEntity in)
	{
		reimbursementId = in.getReimbursementId();
		employeeId = in.getEmployeeId();
		statusId = in.getStatusId();
		dateOfTransaction =  in.getDateOfTransaction();
		amount = in.getAmount();
		details = in.getDetails();
		merchant = in.getMerchant();
		
	}
	public Reimbursement(ReimbursementEntity in, ReceiptEntity reciept)
	{
		this(in);	
	}
	
	
	


	public Reimbursement(int reimbursementId, int employeeId, int statusId, String status, String expenseType,
			String merchant, BigDecimal amount, String details, String dateOfTransaction, String dateSubmitted) {
		super();
		this.reimbursementId = reimbursementId;
		this.employeeId = employeeId;
		this.statusId = statusId;
		this.status = status;
		this.expenseType = expenseType;
		this.merchant = merchant;
		this.amount = amount;
		this.details = details;
		this.dateOfTransaction = dateOfTransaction;
		this.dateSubmitted = dateSubmitted;
		
	}

	public String getEmployee() {
		return Employee;
	}
	public void setEmployee(String employee) {
		Employee = employee;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getExpenseType () {
		return expenseType;
	}
	public void setExpenseType (String type) {
		this.expenseType = type;
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
	public String getDateOfTransaction() {
		return dateOfTransaction;
	}
	public void setDateOfTransaction(String dateOfTransaction) {
		this.dateOfTransaction = dateOfTransaction;
	}
	public String getDateSubmitted() {
		return dateSubmitted;
	}
	public void setDateSubmitted(String date_submitted) {
		this.dateSubmitted = date_submitted;
	}
	public String getMerchant() {
		return merchant;
	}
	public void setMerchant(String merchant) {
		this.merchant = merchant;
	}
	public int getStatusId() {
		return statusId;
	}
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	
}

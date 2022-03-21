package POJO;

import java.math.BigDecimal;

import Entities.ReceiptEntity;
import Entities.ReimbursementEntity;

public class Reimbursement {
	int reimbursementID = 0;
	int employeeID = 0;
	int statusID = 0;
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
		reimbursementID = in.getReimbursementID();
		employeeID = in.getEmployeeID();
		statusID = in.getStatusID();
		status = in.getStatus();
		expenseType=in.getExpenseType();
		merchant = in.getMerchant();
		amount = in.getAmount();
		details = in.getDetails();
		dateOfTransaction = in.getDateOfTransaction();
		dateSubmitted = in.getDateSubmitted();
		
	}
	public Reimbursement(ReimbursementEntity in, ReceiptEntity reciept)
	{
		this(in);	
	}
	
	
	public String getEmployee() {
		return Employee;
	}
	public void setEmployee(String employee) {
		Employee = employee;
	}
	public int getReimbursementID() {
		return reimbursementID;
	}
	public void setReimbursementID(int reimbursementID) {
		this.reimbursementID = reimbursementID;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
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
	public int getStatusID() {
		return statusID;
	}
	public void setStatusID(int statusID) {
		this.statusID = statusID;
	}
	
}

package POJO;

import java.math.BigDecimal;

import Entities.ReceiptEntity;
import Entities.ReimbursementEntity;

public class Reimbursement {
	int reimbursementId = 0;
	int employeeId = 0;
	int statustId = 0;
	int typeId = 0;
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
//		reimbursementId = in.getReimbursementId();
//		employeeId = in.getEmployeeId();
//		statustId = in.getStatustId();
//		typeId= in.getTypeId();
		dateOfTransaction =  in.getDateOfTransaction();
		amount = in.getAmount();
		details = in.getDetails();
		merchant = in.getMerchant();
	}
	public Reimbursement(ReimbursementEntity in, ReceiptEntity reciept)
	{
		this(in);	
	}
	
	
	public Reimbursement(int employeeId2, int statustId2, int typeId2, String dateOfTransaction2, BigDecimal amount2,
			String details2, String merchant2) {
		// TODO Auto-generated constructor stub
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
		return statustId;
	}
	public void setStatusId(int statusId) {
		this.statustId = statusId;
	}
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	
}
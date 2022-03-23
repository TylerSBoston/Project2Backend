package Entities;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.util.Date;

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
	private int reimbursementID = 0;
	@Column(name="employee_id")
	private int employeeID = 0;
	@Column(name="status_id")
	private int statustID = 0;
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

	@Column(name="rimbursement_type")
	private String expenseType = "";
	
	public ReimbursementEntity() {
		
	}

	public ReimbursementEntity(int reimbursement_id, int employeeId, int satustId, String dateOfTransaction,
			BigDecimal amount, String details, String merchant) {
		super();
		this.reimbursementID = reimbursement_id;
		this.employeeID = employeeId;
		this.statustID = satustId;
		this.dateOfTransaction = dateOfTransaction;
		this.amount = amount;
		this.details = details;
		this.merchant = merchant;
	}

	public int getReimbursementID() {
		return reimbursementID;
	}

	public void setReimbursementID(int reimbursementId) {
		this.reimbursementID = reimbursementId;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public int getStatusID() {
		return statustID;
	}

	public void setStatusID(int satustID) {
		this.statustID = satustID;
	}

	public String getDateOfTransaction() {
		return dateOfTransaction;
	}

	public void setDateOfTransaction(String dateOfTransaction) {
		this.dateOfTransaction = dateOfTransaction;
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


	public String getDateSubmitted() {
		return dateSubmitted;
	}

	public void setDateSubmitted(String dateOfSubmission) {
		this.dateSubmitted = dateOfSubmission;
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

	public void setExpenseType(String reimbursementType) {
		this.expenseType = expenseType;
	}


	@Override
	public String toString() {
		return "ReimbursementEntity [reimbursementID=" + reimbursementID + ", employeeID=" + employeeID + ", satustId="
				+ statustID + ", dateOfTransaction=" + dateOfTransaction + ", amount=" + amount
				+ ", details=" + details + ", merchant=" + merchant + "]";
	}
	
	
	
	

}

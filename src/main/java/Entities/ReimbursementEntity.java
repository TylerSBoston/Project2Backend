package Entities;

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
	@Column
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int reimbursementId = 0;
	@Column(name="employee_id")
	private int employeeId = 0;
	@Column(name="status_id")
	private int statusId = 0;
	@Column(name="type_id")
	private int typeId = 0;
	@Column(name="date_of_transaction")
	private String dateOfTransaction = "";
	@Column(name="amount")
	private BigDecimal amount = BigDecimal.ZERO;
	@Column(name="details")
	private String details = "";
	@Column(name="merchant")
	private String merchant = "";
	
	public ReimbursementEntity() {
		
	}

	public ReimbursementEntity(int reimbursementId, int employeeId, int statusId, int typeId, String dateOfTransaction,
			BigDecimal amount, String details, String merchant) {
		super();
		this.reimbursementId = reimbursementId;
		this.employeeId = employeeId;
		this.statusId = statusId;
		this.typeId = typeId;
		this.dateOfTransaction = dateOfTransaction;
		this.amount = amount;
		this.details = details;
		this.merchant = merchant;
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

	public int getStatustId() {
		return statusId;
	}

	public void setStatustId(int statusId) {
		this.statusId = statusId;
	}

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
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

	@Override
	public String toString() {
		return "ReimbursementEntity [reimbursementId=" + reimbursementId + ", employeeId=" + employeeId + ", satustId="
				+ statusId + ", typeId=" + typeId + ", dateOfTransaction=" + dateOfTransaction + ", amount=" + amount
				+ ", details=" + details + ", merchant=" + merchant + "]";
	}
	
	
	
	

}

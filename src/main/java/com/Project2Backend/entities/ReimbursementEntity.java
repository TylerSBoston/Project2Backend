package com.Project2Backend.entities;

import java.math.BigDecimal;






import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;




import com.Project2Backend.pojo.Reimbursement;

import lombok.AllArgsConstructor;
import lombok.Builder;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;





@Entity
@Getter
@Setter
@Accessors(chain=true)

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
	
	@Column(name="receipt")
	private String receiptImage;
	

	
	
	
	



	public ReimbursementEntity(Reimbursement rUpdate) {
		// TODO Auto-generated constructor stub
	}
	
	@SuppressWarnings("unused")
	@Override
    public boolean equals(Object reimbursementId) {
        if (this == reimbursementId)
            return true;
        if (reimbursementId == null)
            return false;
        if (getClass() != reimbursementId.getClass())
            return false;
        ReimbursementEntity other = (ReimbursementEntity) reimbursementId;
        if (reimbursementId == null) {
            return false;
        } else if (!reimbursementId.equals(other.reimbursementId))
            return false;
        return true;
    }
	
	



	public ReimbursementEntity(int employeeId, int statusId, String status, String expenseType,
			String dateOfTransaction, String dateSubmitted, BigDecimal amount, String details, String merchant, String receiptImage) {
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
		this.receiptImage = receiptImage;
	}

	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "ReimbursementEntity [reimbursementId=" + reimbursementId + ", employeeId=" + employeeId + ", statusId="
				+ statusId + ", status=" + status + ", expenseType=" + expenseType + ", dateOfTransaction="
				+ dateOfTransaction + ", dateSubmitted=" + dateSubmitted + ", amount=" + amount + ", details=" + details
				+ ", merchant=" + merchant + ", receiptImage=" + receiptImage + "]";
	}






	
	








}



	

	
	
	


	
	
	
	
	
	
	
	

	

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

	
}

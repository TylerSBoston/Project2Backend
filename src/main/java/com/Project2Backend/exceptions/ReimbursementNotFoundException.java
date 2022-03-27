package com.Project2Backend.exceptions;

public class ReimbursementNotFoundException extends Exception {
	
	@Override
	public String getMessage() {
		return "Reimbursement Not Found!!";
	}
	
	

}

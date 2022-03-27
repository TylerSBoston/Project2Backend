package com.Project2Backend.exceptions;

public class ReimbursementNotFoundException extends Exception {
	


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ReimbursementNotFoundException(String string) {
		// TODO Auto-generated constructor stub
	}

	public ReimbursementNotFoundException() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		return "Reimbursement Not Found!!";
	}
	
	

}

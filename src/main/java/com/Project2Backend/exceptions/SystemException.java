package com.Project2Backend.exceptions;

public class SystemException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public SystemException(String string) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		return "Appplication Failed! Please try after somtime!!";
	}
	
	

}
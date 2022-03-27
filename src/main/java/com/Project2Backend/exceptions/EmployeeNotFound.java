package com.Project2Backend.exceptions;

public class EmployeeNotFound extends Exception {
	
	
		
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public EmployeeNotFound(String string) {
		// TODO Auto-generated constructor stub
	}

		public EmployeeNotFound() {
			// TODO Auto-generated constructor stub
		}

		@Override
		public String getMessage() {
			return "Employee Not Found!!";
		}
		
		

	}



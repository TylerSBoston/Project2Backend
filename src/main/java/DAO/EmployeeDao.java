package DAO;




import java.util.List;

import POJO.Employee;
import POJO.Reimbursement;
import exceptions.ReimbursementNotFoundException;
import exceptions.SystemException;

public interface EmployeeDao {
	
	// Read - fetch all books
		List<Reimbursement> fetchAllReimbursements()throws SystemException, ReimbursementNotFoundException;
		// Create
		

		Reimbursement submitRequest(Reimbursement reimbursement)throws SystemException;
		
		Reimbursement fetchARequest(int employeeID)throws SystemException;
		
		Reimbursement updateReimbursement(Reimbursement reimbursement)throws SystemException;
		
		Employee updateEmployee (Employee employee)throws SystemException;
		
		
		

		
		
		

		
		
		
		
		void exitApplication()throws SystemException;
		
	}
	



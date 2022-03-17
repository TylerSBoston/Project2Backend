package DAO;

import org.postgresql.util.*;


import DAO.DBConnection;
import POJO.Employee;
import POJO.Reimbursement;
import POJO.Role;

import java.math.BigDecimal;
import java.sql.*;
import java.util.*;

import org.apache.logging.log4j.*;
public class FinanceManagerDao {
//	private final static Logger log = LogManager.getLogger(FinanceManagerDao.class);
	
	static {
		try {
			Class.forName("org.postgresql.Driver");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static LinkedList<Reimbursement> getPendingReimbursements() throws Exception
	{
//		log.info("in getPendingReimbursements Dao Layer");
		LinkedList<Reimbursement> riems = new LinkedList<Reimbursement>();	
	
		String query = "select * from reimbursements where status_id < 4;";
		CallableStatement st =  DBConnection.getConnection().prepareCall(query);
		ResultSet results = null;

		results = st.executeQuery();
		if(results != null)
		{
			while(results.next())
			{
				Reimbursement r = new Reimbursement();
				
				r.setReimbursementID(results.getInt(1));
				r.setEmployeeID(results.getInt(2));
				r.setStatusID(results.getInt(3));
				r.setStatus(results.getString(4));
				r.setExpenseType(results.getString(5));
				r.setDateOfTransaction(results.getString(6));
				r.setDateSubmitted(results.getString(7));
				r.setAmount(results.getBigDecimal(8));
				r.setDetails(results.getString(9));
				r.setMerchant(results.getString(10));
				
				
				riems.add(r);
			}
		}

		return riems;
	
	
	}

	public static LinkedList<Reimbursement> getCompletedReimbursements() throws SQLException {
	//	log.info("in getPendingReinbursements Dao Layer");
		LinkedList<Reimbursement> riems = new LinkedList<Reimbursement>();	
	
		String query = "select * from reimbursements where status_id > 3;";
		CallableStatement st =  DBConnection.getConnection().prepareCall(query);
		ResultSet results = null;

		results = st.executeQuery();
		if(results != null)
		{
			while(results.next())
			{
				Reimbursement r = new Reimbursement();
				r.setReimbursementID(results.getInt(1));
				r.setEmployeeID(results.getInt(2));
				r.setStatusID(results.getInt(3));
				r.setStatus(results.getString(4));
				r.setExpenseType(results.getString(5));
				r.setDateOfTransaction(results.getString(6));
				r.setDateSubmitted(results.getString(7));
				r.setAmount(results.getBigDecimal(8));
				r.setDetails(results.getString(9));
				r.setMerchant(results.getString(10));
			
				riems.add(r);
			}
		}


		return riems;
	}

	public static LinkedList<Reimbursement> getAllReimbursements() throws SQLException {
//		log.info("in getAllReinbursements Dao Layer");
		LinkedList<Reimbursement> riems = new LinkedList<Reimbursement>();	
	
		String query = "select * from reimbursements;";
		CallableStatement st =  DBConnection.getConnection().prepareCall(query);
		ResultSet results = null;

		results = st.executeQuery();
		if(results != null)
		{
			while(results.next())
			{
				Reimbursement r = new Reimbursement();
				r.setReimbursementID(results.getInt(1));
				r.setEmployeeID(results.getInt(2));
				r.setStatusID(results.getInt(3));
				r.setStatus(results.getString(4));
				r.setExpenseType(results.getString(5));
				r.setDateOfTransaction(results.getString(6));
				r.setDateSubmitted(results.getString(7));
				r.setAmount(results.getBigDecimal(8));
				r.setDetails(results.getString(9));
				r.setMerchant(results.getString(10));	
				riems.add(r);
			}
		}

		return riems;
	}

	public static LinkedList<Reimbursement> getEmployeeReimbursements(int employee) throws SQLException {
//		log.info("in getEmployeeReimbersements Dao Layer");
		LinkedList<Reimbursement> riems = new LinkedList<Reimbursement>();	
	
		String query = "select * from reimbursements where employee_id = " + employee + ";";
		CallableStatement st =  DBConnection.getConnection().prepareCall(query);
		ResultSet results = null;

		results = st.executeQuery();
		if(results != null)
		{
			while(results.next())
			{
				Reimbursement r = new Reimbursement();
				r.setReimbursementID(results.getInt(1));
				r.setEmployeeID(results.getInt(2));
				r.setStatusID(results.getInt(3));
				r.setStatus(results.getString(4));
				r.setExpenseType(results.getString(5));
				r.setDateOfTransaction(results.getString(6));
				r.setDateSubmitted(results.getString(7));
				r.setAmount(results.getBigDecimal(8));
				r.setDetails(results.getString(9));
				r.setMerchant(results.getString(10));
				
				riems.add(r);
			}
		}


		return riems;
	}

	public static LinkedList<Employee> getAllEmployees() throws SQLException {
//		log.info("in getAllEmployees Dao Layer");
		LinkedList<Employee> employees = new LinkedList<Employee>();	
	
		String query = "select * from v_employees;";
		CallableStatement st =  DBConnection.getConnection().prepareCall(query);
		ResultSet results = null;

		results = st.executeQuery();
		if(results != null)
		{
			while(results.next())
			{
				Employee e = new Employee();
				e.setEmployeeID(results.getInt(1));
				e.setEmail(results.getString(3));
				e.setPhone(results.getString(4));
				e.setJobTitle(results.getString(5));
				employees.add(e);
				
				// need to add select to get permissions
				
				
				
			}
		}

		return employees;
	}
	
	
	// this can be put in a shared class, but class assignment....
	public static LinkedList<Role> getRoles(int employeeID) throws SQLException
	{
		
//		log.info("in getRoles Dao Layer");
		LinkedList<Role> roles = new LinkedList<Role>();	
	
		String query = "select permission_id,permission_type from v_employee_permissions where employee_id= "+ employeeID+";";
		CallableStatement st =  DBConnection.getConnection().prepareCall(query);
		ResultSet results = null;

		results = st.executeQuery();
		if(results != null)
		{
			while(results.next())
			{
				Role r = new Role();
				r.setRoleID(results.getInt(1));
				r.setRole(results.getString(2));
				roles.add(r);

			}
		}

		return roles;
		
		
		
		
	}
	
	
	public static Reimbursement updateReimbursement(Reimbursement rUpdate) throws SQLException  {
//		log.info("in getPendingReinbursements Dao Layer");
		Reimbursement r = rUpdate;	
	
		String query =  "call approve_request(?,?,?);";
		
		PreparedStatement st = DBConnection.getConnection().prepareStatement(query);
		st.setInt(1, r.getReimbursementID());
		st.setInt(2, r.getStatusID());
		st.execute();

		return r;
	}
}

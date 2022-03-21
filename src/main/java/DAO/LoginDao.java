package DAO;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Entities.RoleEntity;
import POJO.Employee;

public class LoginDao {
	
	private final static Logger log = LogManager.getLogger(LoginDao.class);
	
	static {
		try {
			Class.forName("org.postgresql.Driver");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static Employee login(Employee e) throws SQLException {
		// TODO Auto-generated method stub
		
		log.info("in getAllEmployees Dao Layer");
		Employee employee = new Employee();	
		// no sql insert check until hibernate =/
		String query = "select * from employees where user_name = '" + e.getUserName() + "' and user_password = '" + e.getPassword() + "';";
		CallableStatement st =  DBConnection.getConnection().prepareCall(query);
		ResultSet results = null;

		results = st.executeQuery();
		if(results.next())
		{
			employee.setEmployeeID(results.getInt(1));
			employee.setJobTitle(results.getString(2));
			employee.setFirstName(results.getString(3));
			employee.setLastName(results.getString(4));
			employee.setEmail(results.getString(5));
			employee.setPhone(results.getString(6));
		}

		return employee;
	}
	
	
	// this can be put in a shared class, but class assignment....
	public static LinkedList< RoleEntity> getRoles(int employeeID) throws SQLException
	{
		
		log.info("in getRoles Dao Layer");
		
		ResultSet results = null;
		

		LinkedList< RoleEntity> roles = new LinkedList< RoleEntity>();	
		
		// the actual main query
		String query = "select permission_id,permission_type from employee_permissions where employee_id= "+ employeeID+";";
		CallableStatement st =  DBConnection.getConnection().prepareCall(query);
		
		results = st.executeQuery();
		if(results != null)
		{
			while(results.next())
			{
				RoleEntity r = new  RoleEntity();
				r.setRoleID(results.getInt(1));
				r.setRole(results.getString(2));
				roles.add(r);
			}
		}
		return roles;

	}
	
}

package com.Project2Backend.service;



import javax.transaction.SystemException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.Project2Backend.dao.EmployeeDao;
import com.Project2Backend.dao.RoleDao;
import com.Project2Backend.pojo.Employee;



public class LoginService {
	
	@Autowired
	EmployeeDao employeeDao;
	
	
	@Autowired
	RoleDao roleDao;
	
	private final static Logger log = LogManager.getLogger(LoginService.class);
	public Employee login(Employee e) throws SystemException {
		// TODO Auto-generated method stub
		
		
		
		
			Employee loggedIn = employeeDao.login(e);
			loggedIn.setRoles(roleDao.findByEmployeeID(loggedIn.getEmployeeId()));
			
			
			return loggedIn;

	}
	public static Object roles(String r) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

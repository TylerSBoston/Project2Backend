package com.Project2Backend.service;



import javax.transaction.SystemException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project2Backend.dao.EmployeeDao;
import com.Project2Backend.dao.ImageDao;
import com.Project2Backend.dao.RoleDao;
import com.Project2Backend.entities.EmployeeEntity;
import com.Project2Backend.entities.ImageEntity;
import com.Project2Backend.pojo.Employee;


@Service
public class LoginService {
	
	@Autowired
	EmployeeDao employeeDao;
	
	
	@Autowired
	RoleDao roleDao;

	
	private final static Logger log = LogManager.getLogger(LoginService.class);
	public Employee login(Employee e) throws SystemException {
		// TODO Auto-generated method stub
		
		
		
		
			EmployeeEntity loggedIn = employeeDao.login(e.getUserName(), e.getPassword());
			Employee returned = new Employee(loggedIn);
			returned.setRoles(roleDao.findByEmployeeID(loggedIn.getEmployeeId()));
			
			return returned;

	}
	public static Object roles(String r) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	
}

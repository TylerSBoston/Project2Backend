package com.Project2Backend.controller;

import javax.transaction.SystemException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Project2Backend.entities.EmployeeEntity;
import com.Project2Backend.entities.ImageEntity;
import com.Project2Backend.pojo.Employee;
import com.Project2Backend.service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	LoginService ls;
	
	@RequestMapping(value = "/login",
			method = RequestMethod.POST,
			consumes="application/JSON",
			produces = MediaType.APPLICATION_JSON_VALUE) 
	Employee login(@RequestBody Employee employee) throws SystemException {
		return ls.login(employee);
	}

}

package com.Project2Backend.controller;

import javax.transaction.SystemException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project2Backend.entities.ImageEntity;
import com.Project2Backend.pojo.Employee;
import com.Project2Backend.service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	LoginService ls;
	
	@PostMapping("/login") 
	Employee login(@RequestBody Employee employee) throws SystemException {
		return ls.login(employee);
	}
	
	//dont think this is needed, outdated version
/*	myServer.get("/roles/{bid}", (ctx)->{
		String r = ctx.pathParam("bid");
		ctx.json(LoginService.roles(r));
	});
	*/
	@GetMapping("ImagePullTest")
	ImageEntity image() throws SystemException {
		return ls.fetchImage();
	}

}

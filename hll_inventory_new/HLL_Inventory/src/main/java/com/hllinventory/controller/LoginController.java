package com.hllinventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hllinventory.model.Inv_Login;
import com.hllinventory.service.LoginService;

@RestController
@CrossOrigin("*")
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private LoginService loginService;

	@GetMapping("logincheck/username/password")
	public Inv_Login userLogin(@PathVariable String username,@PathVariable String password)
	{
		Inv_Login login=loginService.loginCheck(username, password);
		return login;
		
	}	
}

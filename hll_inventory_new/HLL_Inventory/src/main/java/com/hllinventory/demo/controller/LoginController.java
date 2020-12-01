package com.hllinventory.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hllinventory.demo.model.Login;
import com.hllinventory.demo.service.LoginService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private LoginService loginService;

	@GetMapping(value = "/{username}/{password}")
	public Login userLogin(@PathVariable("username")String username,@PathVariable("password") String password)
	{
		 System.out.println("   Username :"+username+" Password : "+password);
		Login login=loginService.loginCheck(username, password);
		return login;
		
	}	
	
	@PostMapping(value = "/addUser")
	public String loginCredentialsAdd(@RequestBody Login login)
	{
		System.out.println("In controller :"+login);
		  loginService.DataAdd(login);
	   return "Add Data";
	}
	
	@GetMapping(value = "/get/{userid}")
	public Login getLoginUser(@PathVariable int userid) {
		 
		 Login login=loginService.getLogin(userid);
		 System.out.println(login);
		 return login;
		 }
    }

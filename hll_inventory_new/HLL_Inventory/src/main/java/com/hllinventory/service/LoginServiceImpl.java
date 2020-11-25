package com.hllinventory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hllinventory.dao.LoginRepository;
import com.hllinventory.model.Inv_Login;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginRepository loginRepository;
	
	@Override
	public Inv_Login loginCheck(String username, String password) {
		
		 Inv_Login login= loginRepository.findByUsernameAndPassword(username, password);
		
		return login;
	}
	
	

}

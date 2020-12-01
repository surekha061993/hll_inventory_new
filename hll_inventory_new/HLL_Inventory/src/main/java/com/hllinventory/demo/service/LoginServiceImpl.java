package com.hllinventory.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hllinventory.demo.dao.LoginRepository;
import com.hllinventory.demo.model.Login;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginRepository loginRepository;
	
	@Override
	public Login loginCheck(String username, String password) {
		
		 Login login= loginRepository.findByUsernameAndPassword(username, password);
		
		return login;
	}

	@Override
	public void DataAdd(Login login) {
		loginRepository.save(login);
	}
	
	  @Override
	  public Login getLogin(int userid)
	  {
		  Login login=loginRepository.findByUserId(userid); 
		  return login; 
	  }


}

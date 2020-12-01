package com.hllinventory.demo.service;


import com.hllinventory.demo.model.Login;

public interface LoginService {

   public Login loginCheck(String username, String password);

   public void DataAdd(Login login);
   Login getLogin(int userid);   

}

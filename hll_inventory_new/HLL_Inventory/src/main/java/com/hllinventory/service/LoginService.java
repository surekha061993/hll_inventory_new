package com.hllinventory.service;


import com.hllinventory.model.Inv_Login;

public interface LoginService {

   public Inv_Login loginCheck(String username, String password);

}

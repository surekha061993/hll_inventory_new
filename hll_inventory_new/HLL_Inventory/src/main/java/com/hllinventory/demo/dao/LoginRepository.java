package com.hllinventory.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hllinventory.demo.model.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Integer>{
	
	public Login findByUsernameAndPassword(String username, String password);
	public Login findByUserId(int userid);

}

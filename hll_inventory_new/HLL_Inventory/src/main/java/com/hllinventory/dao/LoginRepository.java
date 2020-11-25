package com.hllinventory.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hllinventory.model.Inv_Login;

@Repository
public interface LoginRepository extends JpaRepository<Inv_Login, Integer>{
	
	public Inv_Login findByUsernameAndPassword(String username, String password);


}

package com.hllinventory.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hllinventory.demo.model.DocumentMaster;

public interface DocumentMasterRepository extends JpaRepository<DocumentMaster, Integer>{

	//List<DocumentMaster> findByName(String docname);
	

	
}

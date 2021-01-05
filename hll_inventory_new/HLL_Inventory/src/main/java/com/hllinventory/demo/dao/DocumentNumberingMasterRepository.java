package com.hllinventory.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hllinventory.demo.model.DocumentNumberingMaster;

public interface DocumentNumberingMasterRepository extends JpaRepository<DocumentNumberingMaster, Integer> {

}

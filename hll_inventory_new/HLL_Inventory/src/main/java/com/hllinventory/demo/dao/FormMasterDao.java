package com.hllinventory.demo.dao;

import java.util.List;

import com.hllinventory.demo.model.FormMaster;

public interface FormMasterDao {

	
	 public void saveForm(FormMaster form);
	 public int deleteForms(int formId);
	public List<FormMaster> getAllForm();
		
}

package com.hllinventory.demo.service;

import java.util.List;

import com.hllinventory.demo.model.FormMaster;

public interface FormMasterService {

	public void saveForm(FormMaster form);
	public int deleteForm(int formId);
	public List<FormMaster> getAllForm();
	
}

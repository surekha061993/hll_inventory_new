package com.hllinventory.demo.dao;

import java.util.List;

import com.hllinventory.demo.model.FormMaster;
import com.hllinventory.demo.model.InventoryFinancialYear;

/**
 * @author Surekha Londhe
 * @Date 16-12-2020
 */
public interface FormMasterDao {

	
	 public void saveForm(FormMaster form);
	 public FormMaster deleteForms(FormMaster form);
	 public List<FormMaster> getAllForm();
	 public FormMaster getFormMaster(int formId);	
	 // public void deleteForms(FormMaster form);
	 public boolean update(FormMaster form);	
	
}

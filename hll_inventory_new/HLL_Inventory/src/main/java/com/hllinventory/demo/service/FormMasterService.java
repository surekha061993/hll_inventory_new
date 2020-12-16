package com.hllinventory.demo.service;

import java.util.List;

import com.hllinventory.demo.model.FormMaster;
import com.hllinventory.demo.model.InventoryFinancialYear;

/**
 * @author Surekha Londhe
 * @Date 16-12-2020
 */
public interface FormMasterService {

	public void saveForm(FormMaster form);
	public FormMaster remove(FormMaster form);
	public FormMaster getFormMaster(int formId);
	public List<FormMaster> getAllForm();
	public void update(FormMaster form);

}

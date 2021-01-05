package com.hllinventory.demo.dao;

import java.util.List;

import com.hllinventory.demo.model.PackingMaster;
import com.hllinventory.demo.model.TaxMaster;

public interface TaxMasterDao {

	public void saveTax(TaxMaster tax);
	public TaxMaster getTax(Integer tax_id);
	public List<TaxMaster> getAllTax();
	public void updateTax(TaxMaster tax);
}

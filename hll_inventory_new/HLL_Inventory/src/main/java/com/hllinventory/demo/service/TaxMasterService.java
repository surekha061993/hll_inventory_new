package com.hllinventory.demo.service;

import java.util.List;

import com.hllinventory.demo.model.TaxMaster;

public interface TaxMasterService {
	public void saveTax(TaxMaster tax);

	public TaxMaster getTax(int tax_id);

	public List<TaxMaster> getAllTax();

	public void updateTax(TaxMaster tax);

	public TaxMaster deleteTax(TaxMaster tax);
}

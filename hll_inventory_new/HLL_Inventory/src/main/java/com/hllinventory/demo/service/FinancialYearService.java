package com.hllinventory.demo.service;

import java.util.List;

import com.hllinventory.demo.model.FinancialYearMaster;
/**
 * @author Surekha Londhe
 * @Date 17-12-2020
 */

public interface FinancialYearService {
	
	public void saveFinancialYear(FinancialYearMaster finYear);

	public List<FinancialYearMaster> getAllFinancialYear();

	public FinancialYearMaster getFinancialYear(int finYearId);

	public void updateFinancialYear(FinancialYearMaster financialYear);

	public FinancialYearMaster deleteFinancialYear(FinancialYearMaster financialYear);

}

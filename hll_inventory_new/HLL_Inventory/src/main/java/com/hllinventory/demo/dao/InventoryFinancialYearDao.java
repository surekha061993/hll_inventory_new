package com.hllinventory.demo.dao;

import java.util.List;

import com.hllinventory.demo.model.DocumentMaster;
import com.hllinventory.demo.model.InventoryFinancialYear;

/**
 * @author Surekha Londhe
 * @Date 14-12-2020
 */

public interface InventoryFinancialYearDao {
	    public void saveFinancialYear(InventoryFinancialYear finYear);
		public InventoryFinancialYear getFinancialYear(int finYearId);
		public void updateFinancialYear(InventoryFinancialYear financialYear);	
		public InventoryFinancialYear deleteFinancialYear(InventoryFinancialYear financialYear);
		public List<InventoryFinancialYear> getAllFinancialYear();
		
}

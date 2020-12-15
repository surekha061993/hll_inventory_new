package com.hllinventory.demo.service;

import java.util.List;

import com.hllinventory.demo.model.InventoryFinancialYear;

/**
 * @author Surekha Londhe
 * @Date 14-12-2020
 */

public interface InventoryFinancialYearService {

	public void saveFinancialYear(InventoryFinancialYear finYear);

	public List<InventoryFinancialYear> getAllFinancialYear();

	public InventoryFinancialYear getFinancialYear(int finYearId);

	public void updateFinancialYear(InventoryFinancialYear financialYear);

	public InventoryFinancialYear deleteFinancialYear(InventoryFinancialYear financialYear);

}

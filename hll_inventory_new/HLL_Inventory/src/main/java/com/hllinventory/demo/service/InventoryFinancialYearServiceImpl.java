package com.hllinventory.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hllinventory.demo.dao.InventoryFinancialYearDao;
import com.hllinventory.demo.model.InventoryFinancialYear;

/**
 * @author Surekha Londhe
 * @Date 14-12-2020
 */

@Service
public class InventoryFinancialYearServiceImpl implements InventoryFinancialYearService {

	@Autowired
	private InventoryFinancialYearDao financialYearDao;
	
	
	@Override
	public void saveFinancialYear(InventoryFinancialYear finYear) {
		financialYearDao.saveFinancialYear(finYear);
	}

	@Override
	public List<InventoryFinancialYear> getAllFinancialYear() {
		List<InventoryFinancialYear> financialYear=financialYearDao.getAllFinancialYear();
		return financialYear;
	}

	@Override
	public InventoryFinancialYear getFinancialYear(int finYearId) {
		 return financialYearDao.getFinancialYear(finYearId);
	}

	@Override
	public void updateFinancialYear(InventoryFinancialYear financialYear) {
		financialYearDao.updateFinancialYear(financialYear);
	}

	@Override
	public InventoryFinancialYear deleteFinancialYear(InventoryFinancialYear financialYear) {
		financialYear.setFinDeleteFlag(1);
		financialYearDao.updateFinancialYear(financialYear);
		return financialYear;
	}

}

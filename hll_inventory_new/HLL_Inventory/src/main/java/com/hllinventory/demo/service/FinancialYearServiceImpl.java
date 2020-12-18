package com.hllinventory.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hllinventory.demo.dao.FinancialYearDao;
import com.hllinventory.demo.model.FinancialYearMaster;
/**
 * @author Surekha Londhe
 * @Date 17-12-2020
 */

@Service
public class FinancialYearServiceImpl implements FinancialYearService{
	@Autowired
	private FinancialYearDao financialYearDao;
	
	
	@Override
	public void saveFinancialYear(FinancialYearMaster finYear) {
		financialYearDao.saveFinancialYear(finYear);
	}

	@Override
	public List<FinancialYearMaster> getAllFinancialYear() {
		List<FinancialYearMaster> financialYear=financialYearDao.getAllFinancialYear();
		return financialYear;
	}

	@Override
	public FinancialYearMaster getFinancialYear(int finYearId) {
		 return financialYearDao.getFinancialYear(finYearId);
	}

	@Override
	public void updateFinancialYear(FinancialYearMaster financialYear) {
		financialYearDao.updateFinancialYear(financialYear);
	}

	@Override
	public FinancialYearMaster deleteFinancialYear(FinancialYearMaster financialYear) {
		financialYear.setYearDeleteFlag(1);
		financialYearDao.updateFinancialYear(financialYear);
		return financialYear;
	}

}

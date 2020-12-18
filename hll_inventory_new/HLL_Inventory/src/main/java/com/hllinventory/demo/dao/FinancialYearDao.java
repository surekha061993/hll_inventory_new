package com.hllinventory.demo.dao;

import java.util.List;

import com.hllinventory.demo.model.FinancialYearMaster;
/**
 * @author Surekha Londhe
 * @Date 17-12-2020
 */
public interface FinancialYearDao {
	        public void saveFinancialYear(FinancialYearMaster finYear);
			public FinancialYearMaster getFinancialYear(int finYearId);
			public void updateFinancialYear(FinancialYearMaster financialYear);	
			public List<FinancialYearMaster> getAllFinancialYear();
		}

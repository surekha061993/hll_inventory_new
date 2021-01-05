package com.hllinventory.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hllinventory.demo.dao.TaxMasterDao;
import com.hllinventory.demo.model.TaxMaster;
/**
 * @author Surekha Londhe
 * @Date 24-12-2020
 */

@Service
public class TaxMasterServiceImpl implements TaxMasterService{

	@Autowired
	private TaxMasterDao taxDao;
	
	@Override
	public void saveTax(TaxMaster tax) {
		taxDao.saveTax(tax);
	}

	@Override
	public TaxMaster getTax(int tax_id) {
		return taxDao.getTax(tax_id);
	}

	@Override
	public List<TaxMaster> getAllTax() {
		List<TaxMaster> tax=taxDao.getAllTax();
		return tax;
	}

	@Override
	public void updateTax(TaxMaster tax) {
		taxDao.updateTax(tax);
	}

	@Override
	public TaxMaster deleteTax(TaxMaster tax) {
	    tax.setTax_delete_flag(1);
		taxDao.updateTax(tax);
		return tax;
	}

}

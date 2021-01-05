package com.hllinventory.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hllinventory.demo.dao.ChargesMasterDao;
import com.hllinventory.demo.model.ChargesMaster;
/**
 * @author Surekha Londhe
 * @Date 20-12-2020
 */
@Service
public class ChargesMasterServiceImpl implements ChargesMasterService {

	@Autowired
	private ChargesMasterDao chargesMasterDao;
	
	@Override
	public void saveCharges(ChargesMaster charges) {
		charges.setStatus("Y");
		chargesMasterDao.saveChargesMaster(charges);
	}

	@Override
	public ChargesMaster getCharges(int inv_charges_Id) {
		return chargesMasterDao.getChargesMaster(inv_charges_Id);
     }

	@Override
	public List<ChargesMaster> getAllCharges() {
		List<ChargesMaster> list=chargesMasterDao.getAllChargesMaster();
		return list;
	}

	@Override
	public void updateCharges(ChargesMaster charges) {
		chargesMasterDao.updateChargesMaster(charges);
	}

	@Override
	public ChargesMaster deleteCharges(ChargesMaster charges) {
		charges.setStatus("N");
		chargesMasterDao.updateChargesMaster(charges);
		return charges;
	}
}

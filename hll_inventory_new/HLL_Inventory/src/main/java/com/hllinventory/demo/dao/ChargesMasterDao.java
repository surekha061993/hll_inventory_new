package com.hllinventory.demo.dao;

import java.util.List;

import com.hllinventory.demo.model.ChargesMaster;
/**
 * @author Surekha Londhe
 * @Date 20-12-2020
 */
public interface ChargesMasterDao {

	public void saveChargesMaster(ChargesMaster charges);
	public ChargesMaster getChargesMaster(Integer inv_charges_Id);
	public List<ChargesMaster> getAllChargesMaster();
	public void updateChargesMaster(ChargesMaster charges);

}

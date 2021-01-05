package com.hllinventory.demo.service;

import java.util.List;

import com.hllinventory.demo.model.ChargesMaster;
/**
 * @author Surekha Londhe
 * @Date 20-12-2020
 */
public interface ChargesMasterService {
	public void saveCharges(ChargesMaster charges);

	public ChargesMaster getCharges(int inv_charges_Id);

	public List<ChargesMaster> getAllCharges();

	public void updateCharges(ChargesMaster charges);

	public ChargesMaster deleteCharges(ChargesMaster charges);

}

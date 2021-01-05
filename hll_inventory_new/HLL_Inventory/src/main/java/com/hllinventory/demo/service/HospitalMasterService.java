package com.hllinventory.demo.service;

import java.util.List;

import com.hllinventory.demo.model.HospitalMaster;
/**
 * @author Surekha Londhe
 * @Date 29-12-2020
 */
public interface HospitalMasterService {
	public void saveHospital(HospitalMaster hospital);

	public HospitalMaster getHospital(int idinv_hospital_details);

	public List<HospitalMaster> getAllHospital();

	public void updateHospital(HospitalMaster hospital);

	public HospitalMaster deleteHospital(HospitalMaster hospital);
}

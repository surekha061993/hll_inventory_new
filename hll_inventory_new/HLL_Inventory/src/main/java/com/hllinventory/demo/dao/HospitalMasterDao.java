package com.hllinventory.demo.dao;

import java.util.List;

import com.hllinventory.demo.model.HospitalMaster;
/**
 * @author Surekha Londhe
 * @Date 29-12-2020
 */
public interface HospitalMasterDao {
	public void saveHospitalMaster(HospitalMaster hospital);
	public HospitalMaster getHospitalMaster(Integer idinv_hospital_details);
	public List<HospitalMaster> getAllHospitalMaster();
	public void updateHospitalMaster(HospitalMaster hospital);
}

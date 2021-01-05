package com.hllinventory.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hllinventory.demo.dao.HospitalMasterDao;
import com.hllinventory.demo.model.HospitalMaster;
/**
 * @author Surekha Londhe
 * @Date 29-12-2020
 */
@Service
public class HospitalMasterServiceImpl implements HospitalMasterService{

	@Autowired
	private HospitalMasterDao hospitalDao;

	@Override
	public void saveHospital(HospitalMaster hospital) {
		hospitalDao.saveHospitalMaster(hospital);
	}

	@Override
	public HospitalMaster getHospital(int idinv_hospital_details) {
		return hospitalDao.getHospitalMaster(idinv_hospital_details);
	}

	@Override
	public List<HospitalMaster> getAllHospital() {
		List<HospitalMaster> hospital=hospitalDao.getAllHospitalMaster();
		return hospital;
	}

	@Override
	public void updateHospital(HospitalMaster hospital) {
		hospitalDao.updateHospitalMaster(hospital);
	}

	@Override
	public HospitalMaster deleteHospital(HospitalMaster hospital) {
		hospital.setInvHospitalDeleteFlag(1);
		hospitalDao.updateHospitalMaster(hospital);
		return hospital;
	}
}

package com.hllinventory.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hllinventory.demo.dao.ManufacturerMasterDao;
import com.hllinventory.demo.model.ManufacturerMaster;

/**
 * @author Surekha Londhe
 * @Date 18-12-2020
 */

@Service
public class ManufacturerMasterServiceImpl implements ManufacturerMasterService {

	@Autowired
	private ManufacturerMasterDao manufactureDao;
	
	@Override
	public void saveManufacturer(ManufacturerMaster manufacture) {
		manufacture.setManufacturerStatus("Y");
		manufactureDao.saveManufacturer(manufacture);
	}

	@Override
	public ManufacturerMaster getManufacturer(int manufacturerId) {
		return manufactureDao.getManufacturer(manufacturerId);
	}

	@Override
	public List<ManufacturerMaster> getAllManufacturer() {
		List<ManufacturerMaster> list=manufactureDao.getAllManufacturer();
		return list;
	}

	@Override
	public void updateManufacturer(ManufacturerMaster manufacture) {
		manufactureDao.updateManufacturer(manufacture);
	}

	@Override
	public ManufacturerMaster deleteManufacturer(ManufacturerMaster manufacture) {
		manufacture.setManufacturerStatus("N");
		manufactureDao.updateManufacturer(manufacture);
		return manufacture;
	}
}

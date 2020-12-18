package com.hllinventory.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hllinventory.demo.model.ManufacturerMaster;
/**
 * @author Surekha Londhe
 * @Date 18-12-2020
 */

public interface ManufacturerMasterDao {
	public void saveManufacturer(ManufacturerMaster manufacture);
	public ManufacturerMaster getManufacturer(Integer manufacturerId);
	public List<ManufacturerMaster> getAllManufacturer();
	public void updateManufacturer(ManufacturerMaster manufacture);
	
}

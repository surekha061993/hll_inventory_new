package com.hllinventory.demo.service;

import java.util.List;

import com.hllinventory.demo.model.ManufacturerMaster;

/**
 * @author Surekha Londhe
 * @Date 18-12-2020
 */

public interface ManufacturerMasterService {

	public void saveManufacturer(ManufacturerMaster manufacture);

	public ManufacturerMaster getManufacturer(int manufacturerId);

	public List<ManufacturerMaster> getAllManufacturer();

	public void updateManufacturer(ManufacturerMaster manufacture);

	public ManufacturerMaster deleteManufacturer(ManufacturerMaster manufacture);

}

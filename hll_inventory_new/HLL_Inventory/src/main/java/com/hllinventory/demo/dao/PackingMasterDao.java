package com.hllinventory.demo.dao;

import java.util.List;

import com.hllinventory.demo.model.PackingMaster;

/**
 * @author Surekha Londhe
 * @Date 16-12-2020
 */
public interface PackingMasterDao {

	public void savePacking(PackingMaster packing);
	public PackingMaster getPacking(Integer packId);
	public List<PackingMaster> getAllPacking();
	public void updatePacking(PackingMaster packing);
	public PackingMaster deletePacking(PackingMaster packing);
	
}

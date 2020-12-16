package com.hllinventory.demo.service;

import java.util.List;

import com.hllinventory.demo.model.PackingMaster;

/**
 * @author Surekha Londhe
 * @Date 16-12-2020
 */
public interface PackingMasterService {

	public void savePacking(PackingMaster packing);
	public PackingMaster getPacking(int packId);
	public List<PackingMaster> getAllPacking();
	public void updatePacking(PackingMaster packing);
	public PackingMaster deletePacking(PackingMaster packing);
}

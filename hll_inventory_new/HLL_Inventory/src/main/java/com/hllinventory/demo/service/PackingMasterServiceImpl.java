package com.hllinventory.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hllinventory.demo.dao.PackingMasterDao;
import com.hllinventory.demo.model.PackingMaster;

/**
 * @author Surekha Londhe
 * @Date 16-12-2020
 */

@Service
public class PackingMasterServiceImpl implements PackingMasterService {

	@Autowired
	private PackingMasterDao packingDao;
	
	@Override
	public void savePacking(PackingMaster packing) {
	packingDao.savePacking(packing);	
	}

	@Override
	public PackingMaster getPacking(int packId) {
		return packingDao.getPacking(packId);
	}

	@Override
	public List<PackingMaster> getAllPacking() {
		List<PackingMaster> packing=packingDao.getAllPacking();
		return packing;
	}

	@Override
	public void updatePacking(PackingMaster packing) {
		packingDao.updatePacking(packing);
	}

	@Override
	public PackingMaster deletePacking(PackingMaster packing) {
		packing.setPackDeleteFlag(1);
		packingDao.updatePacking(packing);
		return packing;
	}

}

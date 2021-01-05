package com.hllinventory.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hllinventory.demo.dao.LabStoreMasterDao;
import com.hllinventory.demo.model.LabStoreMaster;
/**
 * @author Surekha Londhe
 * @Date 28-12-2020
 */
@Service
public class LabStoreMasterServiceImpl implements LabStoreMasterService{

	@Autowired
	private LabStoreMasterDao labstoreDao;
	
	@Override
	public void saveLabStore(LabStoreMaster labstore) {
		labstore.setSubInventorystatus("Y");
		labstoreDao.saveLabStoreMaster(labstore);
	}

	@Override
	public LabStoreMaster getLabStore(int subinventory_Id) {
		return labstoreDao.getLabStoreMaster(subinventory_Id);
	}

	@Override
	public List<LabStoreMaster> getAllLabStore() {
		List<LabStoreMaster> labstore=labstoreDao.getAllLabStoreMaster();
		return labstore;
	}

	@Override
	public void updateLabStore(LabStoreMaster labstore) {
		labstoreDao.updateLabStoreMaster(labstore);
		
	}

	@Override
	public LabStoreMaster deleteLabStore(LabStoreMaster labstore) {
		labstore.setSubInventorystatus("N");
		labstoreDao.updateLabStoreMaster(labstore);
		return labstore;
	}

}

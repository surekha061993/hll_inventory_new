package com.hllinventory.demo.dao;

import java.util.List;

import com.hllinventory.demo.model.LabStoreMaster;
/**
 * @author Surekha Londhe
 * @Date 28-12-2020
 */
public interface LabStoreMasterDao {
	public void saveLabStoreMaster(LabStoreMaster labstore);
	public LabStoreMaster getLabStoreMaster(Integer subinventory_Id);
	public List<LabStoreMaster> getAllLabStoreMaster();
	public void updateLabStoreMaster(LabStoreMaster labstore);
}

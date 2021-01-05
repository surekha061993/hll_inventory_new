package com.hllinventory.demo.service;

import java.util.List;

import com.hllinventory.demo.model.LabStoreMaster;
/**
 * @author Surekha Londhe
 * @Date 28-12-2020
 */
public interface LabStoreMasterService {
	public void saveLabStore(LabStoreMaster labstore);

	public LabStoreMaster getLabStore(int subinventory_Id);

	public List<LabStoreMaster> getAllLabStore();

	public void updateLabStore(LabStoreMaster labstore);

	public LabStoreMaster deleteLabStore(LabStoreMaster labstore);
}

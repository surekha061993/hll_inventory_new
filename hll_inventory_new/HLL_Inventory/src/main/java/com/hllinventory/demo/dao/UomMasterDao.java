package com.hllinventory.demo.dao;

import java.util.List;

import com.hllinventory.demo.model.UomMaster;

public interface UomMasterDao {

	public void saveUom(UomMaster uom);
	public List<UomMaster> getAllUom();
	public UomMaster getUoms(int uomid);
	public void updateUom(UomMaster uom);	
	public UomMaster deleteUom(UomMaster uom);
}

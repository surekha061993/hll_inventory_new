package com.hllinventory.demo.service;

import java.util.List;

import com.hllinventory.demo.model.DocumentMaster;
import com.hllinventory.demo.model.UomMaster;

public interface UomMasterService {

	public void saveUom(UomMaster uom);
	public List<UomMaster> getAllUom();
	public UomMaster getUom(int uomid);
	public UomMaster deleteUom(UomMaster uom);
	public void updateUom(UomMaster uom);
	
}

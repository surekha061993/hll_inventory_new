package com.hllinventory.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hllinventory.demo.dao.UomMasterDao;
import com.hllinventory.demo.model.UomMaster;

@Service
public class UomMasterServiceImpl implements UomMasterService {

	@Autowired
	private UomMasterDao uomMasterDao;
	
	@Override
	public void saveUom(UomMaster uom) {
		uomMasterDao.saveUom(uom);
	}

	@Override
	public List<UomMaster> getAllUom() {
		List<UomMaster> uom = uomMasterDao.getAllUom();
		return uom;
	}

	@Override
	public UomMaster getUom(int uomid) {
		return uomMasterDao.getUoms(uomid);
	}

	@Override
	public UomMaster deleteUom(UomMaster uom) {
		uom.setUomDeleteFlag(1);
		uomMasterDao.updateUom(uom);
		return uom;
	}

	@Override
	public void updateUom(UomMaster uom) {
		uomMasterDao.updateUom(uom);
	}

	
}

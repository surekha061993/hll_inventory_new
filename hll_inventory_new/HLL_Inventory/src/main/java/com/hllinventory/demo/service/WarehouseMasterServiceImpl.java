package com.hllinventory.demo.service;

import java.util.List;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hllinventory.demo.dao.WarehouseMasterDao;
import com.hllinventory.demo.model.WarehouseMaster;
@Service
public class WarehouseMasterServiceImpl implements WarehouseMasterService{

	@Autowired
	private WarehouseMasterDao warehouseDao;
	
	@Override
	public void saveWarehouse(WarehouseMaster warehouse) {
	     warehouseDao.saveWarehouse(warehouse);	
	}

	@Override
	public WarehouseMaster getWarehouse(int Warehouse_id) {
		return warehouseDao.getWarehouse(Warehouse_id);
	}

	@Override
	public List<WarehouseMaster> getAllWarehouse() {
		List<WarehouseMaster> list=warehouseDao.getAllWarehouse();
		return list;
	}

	@Override
	public void updateWarehouse(WarehouseMaster warehouse) {
		warehouseDao.updateWarehouse(warehouse);
	}

	@Override
	public WarehouseMaster deleteWarehouse(WarehouseMaster warehouse) {
		warehouse.setWarehouse_delete_flag(1);
		warehouseDao.updateWarehouse(warehouse);
		return warehouse;
	}

}

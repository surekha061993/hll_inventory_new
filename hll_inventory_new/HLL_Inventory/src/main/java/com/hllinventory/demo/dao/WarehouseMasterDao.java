package com.hllinventory.demo.dao;

import java.util.List;

import com.hllinventory.demo.model.WarehouseMaster;

public interface WarehouseMasterDao {
	public void saveWarehouse(WarehouseMaster warehouse);
	public WarehouseMaster getWarehouse(Integer warehouse_id);
	public List<WarehouseMaster> getAllWarehouse();
	public void updateWarehouse(WarehouseMaster warehouse);
}

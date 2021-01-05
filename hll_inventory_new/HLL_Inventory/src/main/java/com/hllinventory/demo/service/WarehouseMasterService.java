package com.hllinventory.demo.service;

import java.util.List;

import com.hllinventory.demo.model.WarehouseMaster;

public interface WarehouseMasterService {
	public void saveWarehouse(WarehouseMaster warehouse);

	public WarehouseMaster getWarehouse(int warehouse_id);

	public List<WarehouseMaster> getAllWarehouse();

	public void updateWarehouse(WarehouseMaster warehouse);

	public WarehouseMaster deleteWarehouse(WarehouseMaster warehouse);
}

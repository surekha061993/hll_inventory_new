package com.hllinventory.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hllinventory.demo.model.WarehouseMaster;
import com.hllinventory.demo.service.WarehouseMasterService;
/**
 * @author Surekha Londhe
 * @Date 24-12-2020
 */
@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/warehouse")
public class WarehouseMasterCotroller {
	@Autowired
	private WarehouseMasterService warehouseService;
	
	@PostMapping("/addWarehouse")
	public List<WarehouseMaster> addWarehouse(@RequestBody WarehouseMaster warehouse)
	{
		warehouseService.saveWarehouse(warehouse);
		List<WarehouseMaster> war=(List<WarehouseMaster>) warehouseService.getAllWarehouse();
		return war;
		//return "Warehouse Added Successfully";
	}

	@GetMapping("/getWarehouse/{warehouse_id}")
	public WarehouseMaster getWarehouse(@PathVariable int warehouse_id)
	{
		return warehouseService.getWarehouse(warehouse_id);
	}
	
	@GetMapping("/getAllWarehousex")
	public List<WarehouseMaster> getAllWarehouse()
	{
		List<WarehouseMaster> Warehouse=warehouseService.getAllWarehouse();
		return Warehouse;
	}
	
	@PutMapping("/update")
	public List<WarehouseMaster> updateWarehouse(@RequestBody WarehouseMaster warehouse)
	{
		warehouseService.updateWarehouse(warehouse);
		List<WarehouseMaster> warehousee=warehouseService.getAllWarehouse();
		return warehousee;
	}
	
	@DeleteMapping("/delete/{warehouse_id}")
	public boolean remove(@PathVariable int warehouse_id) {
		WarehouseMaster warehouse = warehouseService.getWarehouse(warehouse_id);
		if (warehouse != null) {
			warehouseService.deleteWarehouse(warehouse);
			return true;
		} 
		return false;
	}
}

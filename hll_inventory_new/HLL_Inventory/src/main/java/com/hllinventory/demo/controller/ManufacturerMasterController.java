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

import com.hllinventory.demo.model.ManufacturerMaster;
import com.hllinventory.demo.service.ManufacturerMasterService;

/**
 * @author Surekha Londhe
 * @Date 18-12-2020
 */
@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/manufactur")
public class ManufacturerMasterController {

	@Autowired
	private ManufacturerMasterService manufacturerService;
	
	@PostMapping("/addManufacturer")
	public List<ManufacturerMaster> addManufactur(@RequestBody ManufacturerMaster Manufacturer)
	{
		manufacturerService.saveManufacturer(Manufacturer);
		List<ManufacturerMaster> list=(List<ManufacturerMaster>) manufacturerService.getAllManufacturer();
		return list;
		//return "Packing Added Successfully";
	}

	@GetMapping("/getId/{manufacturerId}")
	public ManufacturerMaster getManufacturer(@PathVariable int manufacturerId)
	{
		return manufacturerService.getManufacturer(manufacturerId);
	}
	
	@GetMapping("/getAll")
	public List<ManufacturerMaster> getAllManufacturer()
	{
		List<ManufacturerMaster> list=manufacturerService.getAllManufacturer();
		return list;
	}
	
	@PutMapping("/update")
	public List<ManufacturerMaster> updateManufacturer(@RequestBody ManufacturerMaster manufacture)
	{
		manufacturerService.updateManufacturer(manufacture);
		List<ManufacturerMaster> list=manufacturerService.getAllManufacturer();
		return list;
	}
	
	@DeleteMapping("/delete/{manufacturerId}")
	public boolean remove(@PathVariable int manufacturerId) {
		ManufacturerMaster manufacture = manufacturerService.getManufacturer(manufacturerId);
		//if (manufacture != null) {
			manufacturerService.deleteManufacturer(manufacture);
			return true;
	//	} 
		//return false;
	}
}

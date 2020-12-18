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

import com.hllinventory.demo.model.PackingMaster;
import com.hllinventory.demo.service.PackingMasterService;

/**
 * @author Surekha Londhe
 * @Date 16-12-2020
 */
@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/packing")
public class PackingMasterController {
	
	@Autowired
	private PackingMasterService packingService;
	
	@PostMapping("/addPacking")
	public List<PackingMaster> addPacking(@RequestBody PackingMaster packing)
	{
		packingService.savePacking(packing);
		List<PackingMaster> packingg=(List<PackingMaster>) packingService.getAllPacking();
		return packingg;
		//return "Packing Added Successfully";
	}

	@GetMapping("/getPacking/{packId}")
	public PackingMaster getPacking(@PathVariable int packId)
	{
		return packingService.getPacking(packId);
	}
	
	@GetMapping("/getAll")
	public List<PackingMaster> getAllPacking()
	{
		List<PackingMaster> packing=packingService.getAllPacking();
		return packing;
	}
	
	@PutMapping("/update")
	public List<PackingMaster> updatePacking(@RequestBody PackingMaster packing)
	{
		packingService.updatePacking(packing);
		List<PackingMaster> packingg=packingService.getAllPacking();
		return packingg;
	}
	
	@DeleteMapping("/delete/{packId}")
	public boolean remove(@PathVariable int packId) {
		PackingMaster packing = packingService.getPacking(packId);
		if (packing != null) {
			packingService.deletePacking(packing);
			return true;
		} 
		return false;
		
	}
}

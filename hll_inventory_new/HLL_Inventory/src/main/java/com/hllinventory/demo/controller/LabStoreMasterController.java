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

import com.hllinventory.demo.model.LabStoreMaster;
import com.hllinventory.demo.service.LabStoreMasterService;
/**
 * @author Surekha Londhe
 * @Date 28-12-2020
 */
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/labstore")
@RestController
public class LabStoreMasterController {
	
	@Autowired
	private LabStoreMasterService labStoreService;
	
	@PostMapping("/addLabStore")
	public List<LabStoreMaster> addLabStore(@RequestBody LabStoreMaster labstore)
	{
		labStoreService.saveLabStore(labstore);
		List<LabStoreMaster> list=(List<LabStoreMaster>) labStoreService.getAllLabStore();
		return list;
	}

	@GetMapping("/getLabStore/{subinventory_Id}")
	public LabStoreMaster getLabStore(@PathVariable int subinventory_Id)
	{
		return labStoreService.getLabStore(subinventory_Id);
	}
	
	@GetMapping("/getAll")
	public List<LabStoreMaster> getAllLabStore()
	{
		List<LabStoreMaster> labstore=labStoreService.getAllLabStore();
		return labstore;
	}
	
	@PutMapping("/update")
	public List<LabStoreMaster> updateLabStore(@RequestBody LabStoreMaster labstore)
	{
		labStoreService.updateLabStore(labstore);
		List<LabStoreMaster> list=labStoreService.getAllLabStore();
		return list;
	}
	
	@DeleteMapping("/delete/{subinventory_Id}")
	public boolean remove(@PathVariable int subinventory_Id) {
		LabStoreMaster labstore = labStoreService.getLabStore(subinventory_Id);
		if (labstore != null) {
			labStoreService.deleteLabStore(labstore);
			return true;
		} 
		return false;
	}
}

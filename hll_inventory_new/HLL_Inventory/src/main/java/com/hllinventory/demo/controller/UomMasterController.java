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

import com.hllinventory.demo.model.UomMaster;
import com.hllinventory.demo.service.UomMasterService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/uom")
public class UomMasterController {

	@Autowired
	private UomMasterService uomMasterService;
	
	@PostMapping("/addUom")
    public String addUom(@RequestBody UomMaster uom)
    {
   	uomMasterService.saveUom(uom);
   	 return "Uom Saved Successfully";
    }

	
	@GetMapping(value = "/getAllUom")
	public List<UomMaster> getUomData(){
		  List<UomMaster> uom=uomMasterService.getAllUom();
		return uom;
	}
	
	@GetMapping(value = "/getUom/{uomid}")
	public UomMaster getUom(@PathVariable int uomid) {
		return uomMasterService.getUom(uomid);
	     
	}
	
	@PutMapping(value = "/update")
	public void updateUom(@RequestBody UomMaster uom)
	{
		uomMasterService.updateUom(uom);
	}
	
	@DeleteMapping("/deleteUom/{uomid}")
	public boolean deleteUom(@PathVariable int uomid) {
		UomMaster uom = uomMasterService.getUom(uomid);
		if (uom != null) {
			uomMasterService.deleteUom(uom);
			return true;
		} 
		return false;
	}
}

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

import com.hllinventory.demo.model.ChargesMaster;
import com.hllinventory.demo.service.ChargesMasterService;
/**
 * @author Surekha Londhe
 * @Date 20-12-2020
 */
@RequestMapping("/charges")
@RestController
@CrossOrigin(origins="http://localhost:4200")

public class ChargesMasterController {

	@Autowired
	private ChargesMasterService chargesService;
	
	@PostMapping("/addCharges")
	public List<ChargesMaster> addCharges(@RequestBody ChargesMaster charges)
	{
		chargesService.saveCharges(charges);
		List<ChargesMaster> list = (List<ChargesMaster>) chargesService.getAllCharges();
		return list;
	}

	@GetMapping("/getCharges/{inv_charges_Id}")
	public ChargesMaster getCharges(@PathVariable int inv_charges_Id)
	{
		return chargesService.getCharges(inv_charges_Id);
	}
	
	@GetMapping("/getAll")
	public List<ChargesMaster> getAllCharges()
	{
		List<ChargesMaster> Charges = chargesService.getAllCharges();
		return Charges;
	}
	
	@PutMapping("/update")
	public List<ChargesMaster> updateCharges(@RequestBody ChargesMaster Charges)
	{
		chargesService.updateCharges(Charges);
		List<ChargesMaster> list = chargesService.getAllCharges();
		return list;
	}
	
	@DeleteMapping("/delete/{inv_charges_Id}")
	public boolean remove(@PathVariable int inv_charges_Id) {
		ChargesMaster Charges = chargesService.getCharges(inv_charges_Id);
		if (Charges != null) {
			chargesService.deleteCharges(Charges);
			return true;
		} 
		return false;
	}
}

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

import com.hllinventory.demo.model.TaxMaster;
import com.hllinventory.demo.service.TaxMasterService;

/**
 * @author Surekha Londhe
 * @Date 24-12-2020
 */
@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/tax")
public class TaxMasterController {
	@Autowired
	private TaxMasterService taxService;
	
	@PostMapping("/addTaxx")
	public List<TaxMaster> addTax(@RequestBody TaxMaster tax)
	{
		taxService.saveTax(tax);
		List<TaxMaster> taxx=(List<TaxMaster>) taxService.getAllTax();
		return taxx;
		//return "Tax Added Successfully";
	}

	@GetMapping("/getTax/{tax_id}")
	public TaxMaster getTax(@PathVariable int tax_id)
	{
		return taxService.getTax(tax_id);
	}
	
	@GetMapping("/getAlltaxx")
	public List<TaxMaster> getAllTax()
	{
		List<TaxMaster> tax=taxService.getAllTax();
		return tax;
	}
	
	@PutMapping("/update")
	public List<TaxMaster> updateTax(@RequestBody TaxMaster tax)
	{
		taxService.updateTax(tax);
		List<TaxMaster> taxg=taxService.getAllTax();
		return taxg;
	}
	
	@DeleteMapping("/delete/{tax_id}")
	public boolean remove(@PathVariable int tax_id) {
		TaxMaster tax = taxService.getTax(tax_id);
		if (tax != null) {
			taxService.deleteTax(tax);
			return true;
		} 
		return false;
		
	}

}

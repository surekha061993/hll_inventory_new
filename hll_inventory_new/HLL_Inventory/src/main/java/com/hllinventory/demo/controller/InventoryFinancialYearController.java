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

import com.hllinventory.demo.model.InventoryFinancialYear;
import com.hllinventory.demo.service.InventoryFinancialYearService;

/**
 * @author Surekha Londhe
 * @Date 14-12-2020
 */
@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/financialYear")
public class InventoryFinancialYearController {

	@Autowired
	private InventoryFinancialYearService financialYearService;

	@PostMapping("/addFinYear")
	public String addFinancialYear(@RequestBody InventoryFinancialYear finYear) {
		financialYearService.saveFinancialYear(finYear);
		return "Financial Year Saved Successfully";
	}

	@GetMapping(value = "/getAllFinancialYear")
	public List<InventoryFinancialYear> getAllFinancialYearData() {
		List<InventoryFinancialYear> financial = financialYearService.getAllFinancialYear();
		return financial;
	}

	@GetMapping(value = "/getFinancialYear/{finYearId}")
	public InventoryFinancialYear getFinancialYear(@PathVariable int finYearId) {
		return financialYearService.getFinancialYear(finYearId);

	}

	@PutMapping(value = "/updateFinancialYear")
	public void updateFinancialYear(@RequestBody InventoryFinancialYear financialYear) {
		financialYearService.updateFinancialYear(financialYear);
	}
	
	@DeleteMapping(value = "/deleteFinYear/{finYearId}")
	public boolean deleteFinancialYear(@PathVariable("finYearId") int finYearId) {
		InventoryFinancialYear financialYear = financialYearService.getFinancialYear(finYearId);
		financialYearService.deleteFinancialYear(financialYear);
		return true;
	}
	
	
}

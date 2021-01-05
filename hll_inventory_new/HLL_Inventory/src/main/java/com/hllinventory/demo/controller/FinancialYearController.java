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

import com.hllinventory.demo.model.FinancialYearMaster;
import com.hllinventory.demo.model.InventoryFinancialYear;
import com.hllinventory.demo.service.FinancialYearService;
/**
 * @author Surekha Londhe
 * @Date 17-12-2020
 */
@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/financialYear")
public class FinancialYearController {
	@Autowired
	private FinancialYearService financialYearService;

	@PostMapping("/addFinancial")
	public List<FinancialYearMaster> addFinancialYear(@RequestBody FinancialYearMaster finYear) {
		financialYearService.saveFinancialYear(finYear);
		List<FinancialYearMaster> financial=financialYearService.getAllFinancialYear();
		return financial;
		//return "Financial Year Saved Successfully";
	}

	
	@GetMapping(value = "/getAll")
	public List<FinancialYearMaster> getAllFinancialYearData() {
		List<FinancialYearMaster> financial = financialYearService.getAllFinancialYear();
		return financial;
	}

	@GetMapping(value = "/getFinancial/{finYearId}")
	public FinancialYearMaster getFinancialYear(@PathVariable int finYearId) {
		return financialYearService.getFinancialYear(finYearId);

	}

	@PutMapping(value = "/update")
	public void updateFinancialYear(@RequestBody FinancialYearMaster financialYear) {
		financialYearService.updateFinancialYear(financialYear);
	}
	
	@DeleteMapping(value = "/delete/{finYearId}")
	public boolean deleteFinancialYear(@PathVariable("finYearId") int finYearId) {
		FinancialYearMaster financialYear = financialYearService.getFinancialYear(finYearId);
		financialYearService.deleteFinancialYear(financialYear);
		return true;
	}
	

}

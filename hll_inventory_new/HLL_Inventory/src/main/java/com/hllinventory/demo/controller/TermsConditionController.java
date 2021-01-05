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

import com.hllinventory.demo.model.TermsAndCondition;
import com.hllinventory.demo.service.TermsAndConditionService;

/**
 * @author Surekha Londhe
 * @Date 04-01-2021
 */
@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/termscondition")
public class TermsConditionController {
	
	@Autowired
	private TermsAndConditionService termsService;
	
	@PostMapping("/addTermsCondition")
	public List<TermsAndCondition> addTerms(@RequestBody TermsAndCondition terms)
	{
		termsService.saveTermsAndCondition(terms);
		List<TermsAndCondition> list=(List<TermsAndCondition>) termsService.getAllTermsAndCondition();
		return list;
	}

	
	@GetMapping("/getTermsCondition/{inv_termsandCondition_master_id}")
	public TermsAndCondition getTermsCondition(@PathVariable int inv_termsandCondition_master_id)
	{
		return termsService.getTermsAndCondition(inv_termsandCondition_master_id);
	}
	
	@GetMapping("/getAll")
	public List<TermsAndCondition> getAllTermsCondition()
	{
		List<TermsAndCondition> termsCondition=termsService.getAllTermsAndCondition();
		return termsCondition;
	}
	
	@PutMapping("/update")
	public List<TermsAndCondition> updateTermsCondition(@RequestBody TermsAndCondition terms)
	{
		List<TermsAndCondition> termsCondition=termsService.getAllTermsAndCondition();
		return termsCondition;
	}
	
	@DeleteMapping("/delete/{inv_termsandCondition_master_id}")
	public boolean remove(@PathVariable int inv_termsandCondition_master_id) {
		TermsAndCondition termsCondition = termsService.getTermsAndCondition(inv_termsandCondition_master_id);
		if (termsCondition != null) {
			termsService.deleteTermsAndCondition(termsCondition);
			return true;
		} 
		return false;	
	}
}

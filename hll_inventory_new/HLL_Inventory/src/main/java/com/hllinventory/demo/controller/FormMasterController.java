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

import com.hllinventory.demo.model.DocumentMaster;
import com.hllinventory.demo.model.FormMaster;
import com.hllinventory.demo.model.InventoryFinancialYear;
import com.hllinventory.demo.service.FormMasterService;

/**
 * @author Surekha Londhe
 * @Date 15-12-2020
 */

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/form")
public class FormMasterController {

	@Autowired
	private FormMasterService formMasterService;

	@PostMapping("/addForm")
	public void addForm(@RequestBody FormMaster form) {
		formMasterService.saveForm(form);
		//return "Form Saved Successfully";
	}

	@DeleteMapping("/delete/{formId}")
	public void deleteFormMaster(@PathVariable("formId") int formId) {
		FormMaster form = formMasterService.getFormMaster(formId);
		formMasterService.remove(form);
		//return true;
	}

	@GetMapping(value = "/getAllForm")
	public List<FormMaster> getFormData() {
		List<FormMaster> form = formMasterService.getAllForm();
		return form;
	}

	@GetMapping("/getForm/{formId}")
	public FormMaster getForm(@PathVariable int formId) {
		return formMasterService.getFormMaster(formId);
	}

	@PutMapping(value = "/update")
	public void updateFormMaster(@RequestBody FormMaster form) {
		formMasterService.update(form);
	}
}

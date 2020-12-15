package com.hllinventory.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hllinventory.demo.model.DocumentMaster;
import com.hllinventory.demo.model.FormMaster;
import com.hllinventory.demo.service.FormMasterService;

/**
 * @author Surekha Londhe
 * @Date 15-12-2020
 */


@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/form")
public class FormMasterController {
	
	@Autowired
	private FormMasterService formMasterService;
	
	 @PostMapping("/addForm")
     public String addForm(@RequestBody FormMaster form)
     {
    	formMasterService.saveForm(form);
    	 return "Form Saved Successfully";
     }
//	 @DeleteMapping( "/deleteForm/{formId}")
//		public List<FormMaster> deleteForm(@PathVariable("formId") FormMaster form)
//		{
//		   formMasterService.deleteForm(form);
//		   List<FormMaster> formm=formMasterService.getAllForm();
//		   return formm;
//		}
	 @DeleteMapping( "/deleteForm/{formId}")
		public List<FormMaster> deleteForm(@PathVariable("formId") int formId)
		{
		   formMasterService.deleteForm(formId);
		   List<FormMaster> formm=formMasterService.getAllForm();
		   return formm;
		}
	 @GetMapping(value = "/getAllForm")
		public List<FormMaster> getDocumetData(){
			  List<FormMaster> form=formMasterService.getAllForm();
			return form;
		}

}

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

import com.hllinventory.demo.model.DocumentNumberingMaster;
import com.hllinventory.demo.service.DocumentNumberingMasterService;
@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/documentnumbering")
public class DocumentNumberingMasterController {
	
	@Autowired
	private DocumentNumberingMasterService documentService;

    @PostMapping("/addDocument")
     public List<DocumentNumberingMaster> addDocument(@RequestBody DocumentNumberingMaster document)
     {
    	documentService.saveDocument(document);
    	List<DocumentNumberingMaster> list=(List<DocumentNumberingMaster>)documentService.getAllDocument();
    	System.out.println("In controller:"+list);
    	return list;
     }

	
	@GetMapping(value = "/getAllDocument")
	public List<DocumentNumberingMaster> getDocumetData(){
		  List<DocumentNumberingMaster> document=documentService.getAllDocument();
		return document;
	}
	
	@GetMapping(value = "/getDocument/{docNumId}")
	public DocumentNumberingMaster getDocument(@PathVariable int docNumId) {
		return documentService.getDocument(docNumId);
	     
	}
	
	@PutMapping(value = "/update")
	public void updateDocument(@RequestBody DocumentNumberingMaster document)
	{
		 documentService.updateDocument(document);
	}
	
	
	@DeleteMapping(value = "/deleteDocument/{docNumId}")
	public List<DocumentNumberingMaster> deleteDocument(@PathVariable("docNumId") DocumentNumberingMaster documentt)
	{
	   documentService.deleteDocument(documentt);
	   List<DocumentNumberingMaster> document=documentService.getAllDocument();
	   return document;
	}

}

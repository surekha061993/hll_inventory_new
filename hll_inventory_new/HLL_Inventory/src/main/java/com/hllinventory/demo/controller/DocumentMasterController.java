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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hllinventory.demo.model.DocumentMaster;
import com.hllinventory.demo.service.DocumentMasterService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/document")
public class DocumentMasterController {
	
	@Autowired
	private DocumentMasterService documentMasterService;
	
	    @PostMapping("/addDocument")
         public String addDocument(@RequestBody DocumentMaster document)
         {
	    	documentMasterService.saveDocument(document);
        	 return "Document Saved Successfully";
         }

		
		@GetMapping(value = "/getAllDocument")
		public List<DocumentMaster> getDocumetData(){
			  List<DocumentMaster> document=documentMasterService.getAllDocument();
			return document;
		}
		
		@GetMapping(value = "/getDocument/{docid}")
		public DocumentMaster getDocument(@PathVariable int docid) {
			return documentMasterService.getDocument(docid).get();
		     
		}
		
		@PutMapping(value = "/update")
		public List<DocumentMaster> updateDocument(@RequestBody DocumentMaster document)
		{
			return documentMasterService.updateDocument(document);
		  
		}
		
		@DeleteMapping(value = "/deleteDocument/{docid}")
		public List<DocumentMaster> deleteDocument(@PathVariable("docid") int docid)
		{
			documentMasterService.deleteDocument(docid);
		   List<DocumentMaster> document=documentMasterService.getAllDocument();
		   return document;
		}
//		@GetMapping(value = "/searchDocument/{docname}")
//		public List<DocumentMaster> searchDocument(@PathVariable String docname)
//		{
//			return documentMasterService.searchDocumentByName(docname);
//		}
//		
	    
}

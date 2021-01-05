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
import com.hllinventory.demo.model.TaxMaster;
import com.hllinventory.demo.service.DocumentMasterService;

/**
 * @author Surekha Londhe
 * @Date 7-12-2020
 */


@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/document")
public class DocumentMasterController {
	
	@Autowired
	private DocumentMasterService documentMasterService;
	
	    @PostMapping("/addDocument")
         public List<DocumentMaster> addDocument(@RequestBody DocumentMaster document)
         {
	    	documentMasterService.saveDocument(document);
	    	List<DocumentMaster> doc=(List<DocumentMaster>) documentMasterService.getAllDocument();
			 return doc;
         }

		
		@GetMapping(value = "/getAllDocument")
		public List<DocumentMaster> getDocumetData(){
			  List<DocumentMaster> document=documentMasterService.getAllDocument();
			return document;
		}
		
		@GetMapping(value = "/getDocument/{docid}")
		public DocumentMaster getDocument(@PathVariable int docid) {
			return documentMasterService.getDocument(docid);
		     
		}
		
		@PutMapping(value = "/update")
		public void updateDocument(@RequestBody DocumentMaster document)
		{
			 documentMasterService.updateDocument(document);
		}
		
		
		@DeleteMapping(value = "/deleteDocument/{docid}")
		public boolean deleteDocument(@PathVariable int docid) {
			DocumentMaster document = documentMasterService.getDocument(docid);
			if (document != null) {
				documentMasterService.deleteDocument(document);
				return true;
			} 
			return false;
			
		}

/*		public List<DocumentMaster> deleteDocument(@PathVariable("docid") DocumentMaster documentt)
		{
		   documentMasterService.deleteDocument(documentt);
		   List<DocumentMaster> document=documentMasterService.getAllDocument();
		   return document;
		}
*/		
		/*@PutMapping(value = "/update")
		public List<DocumentMaster> updateDocument(@RequestBody DocumentMaster document)
		{
			return documentMasterService.updateDocument(document);
		  
		}*/
		
//		@GetMapping(value = "/searchDocument/{docname}")
//		public List<DocumentMaster> searchDocument(@PathVariable String docname)
//		{
//			return documentMasterService.searchDocumentByName(docname);
//		}
//		
	    
}

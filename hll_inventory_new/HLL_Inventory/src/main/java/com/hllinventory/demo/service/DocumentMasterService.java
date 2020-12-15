package com.hllinventory.demo.service;

import java.util.List;
import java.util.Optional;

import com.hllinventory.demo.model.DocumentMaster;

/**
 * @author Surekha Londhe
 * @Date 8-12-2020
 */

public interface DocumentMasterService {

	public void saveDocument(DocumentMaster document);
	public DocumentMaster getDocument(int docid);
	public List<DocumentMaster> getAllDocument();
    public DocumentMaster deleteDocument(DocumentMaster document);
	public void updateDocument(DocumentMaster document);
    

	// public Optional<DocumentMaster> getDocument(int docid);
	//public List<DocumentMaster> searchDocumentByName(String docname);
	//public List<DocumentMaster> updateDocument(DocumentMaster document);
    
}

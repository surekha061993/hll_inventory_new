package com.hllinventory.demo.service;

import java.util.List;

import com.hllinventory.demo.model.DocumentMaster;
import com.hllinventory.demo.model.DocumentNumberingMaster;

/**
 * @author Surekha Londhe
 * @Date 21-12-2020
 */
public interface DocumentNumberingMasterService {
	
	public void saveDocument(DocumentNumberingMaster document);
	public DocumentNumberingMaster getDocument(int docNumId);
	public List<DocumentNumberingMaster> getAllDocument();
    public DocumentNumberingMaster deleteDocument(DocumentNumberingMaster document);
	public void updateDocument(DocumentNumberingMaster document);
    
}

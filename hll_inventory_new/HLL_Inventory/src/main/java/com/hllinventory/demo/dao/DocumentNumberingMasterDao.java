package com.hllinventory.demo.dao;

import java.util.List;

import com.hllinventory.demo.model.DocumentNumberingMaster;

/**
 * @author Surekha Londhe
 * @Date 21-12-2020
 */
public interface DocumentNumberingMasterDao {
	public void saveDocument(DocumentNumberingMaster document);

	public DocumentNumberingMaster getDocuments(int docNumId);

	public void updateDocument(DocumentNumberingMaster document);

	public List<DocumentNumberingMaster> getAllDocuments();

}

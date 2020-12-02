package com.hllinventory.demo.service;

import java.util.List;
import java.util.Optional;

import com.hllinventory.demo.model.DocumentMaster;

public interface DocumentMasterService {

	public void saveDocument(DocumentMaster document);
    public Optional<DocumentMaster> getDocument(int docid);
    public List<DocumentMaster> updateDocument(DocumentMaster document);
    public List<DocumentMaster> getAllDocument();
    public int deleteDocument(int docid);
	//public List<DocumentMaster> searchDocumentByName(String docname);
}

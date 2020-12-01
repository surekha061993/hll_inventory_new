package com.hllinventory.demo.service;

import java.util.List;

import com.hllinventory.demo.model.DocumentMaster;

public interface DocumentMasterService {

	public void saveDocument(DocumentMaster document);
    public DocumentMaster getDocument(int docid);
    public DocumentMaster updateDocument(DocumentMaster document);
    public List<DocumentMaster> getAllDocument();
    public int deleteDocument(int docid);
}

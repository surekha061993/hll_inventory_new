package com.hllinventory.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.hllinventory.demo.model.DocumentMaster;

/**
 * @author Surekha Londhe
 * @Date 7-12-2020
 */

public interface DocumentMasterDao {


    public void saveDocument(DocumentMaster document);
	public DocumentMaster getDocuments(int doc_id);
	public void updateDocument(DocumentMaster document);	
	public DocumentMaster deleteDocuments(DocumentMaster document);
	public List<DocumentMaster> getAllDocuments();
	
	

}

package com.hllinventory.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hllinventory.demo.dao.DocumentNumberingMasterDao;
import com.hllinventory.demo.dao.DocumentNumberingMasterRepository;
import com.hllinventory.demo.model.DocumentNumberingMaster;

/**
 * @author Surekha Londhe
 * @Date 21-12-2020
 */

@Service
public class DocumentNumberingMasterServiceImpl implements DocumentNumberingMasterService{

	@Autowired
	private DocumentNumberingMasterDao documentNumDao;
	
	@Autowired
	DocumentNumberingMasterRepository repo;
	@Override
	public void saveDocument(DocumentNumberingMaster document) {
		documentNumDao.saveDocument(document);
		//repo.save(document);
		System.out.println("In Srvice:"+document);
	}

	@Override
	public DocumentNumberingMaster getDocument(int docNumId) {
		return documentNumDao.getDocuments(docNumId);
	}

	@Override
	public List<DocumentNumberingMaster> getAllDocument() {
		List<DocumentNumberingMaster> list=documentNumDao.getAllDocuments();
		return list;
	}
	

	@Override
	public DocumentNumberingMaster deleteDocument(DocumentNumberingMaster document) {
		document.setDocDeleteFlag(1);
		documentNumDao.updateDocument(document);
		return document;
	}

	@Override
	public void updateDocument(DocumentNumberingMaster document) {
		documentNumDao.updateDocument(document);		
	}
}

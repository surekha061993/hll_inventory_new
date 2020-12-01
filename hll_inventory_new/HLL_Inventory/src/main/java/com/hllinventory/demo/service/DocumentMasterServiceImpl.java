package com.hllinventory.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hllinventory.demo.dao.DocumentMasterRepository;
import com.hllinventory.demo.model.DocumentMaster;

@Service
public class DocumentMasterServiceImpl implements DocumentMasterService {

	@Autowired
	private DocumentMasterRepository documentRepository;
	
	@Override
	public void saveDocument(DocumentMaster document) {
		documentRepository.save(document);
	}

	@Override
	public DocumentMaster getDocument(int docid) {
		DocumentMaster document=documentRepository.findById(docid).get();
		return document;
	}

	@Override
	public DocumentMaster updateDocument(DocumentMaster document) {
		documentRepository.save(document);
		DocumentMaster documentt=documentRepository.findById(document.getDocid()).get();
		return document;
	}


	@Override
	public List<DocumentMaster> getAllDocument() {
		List<DocumentMaster> document=documentRepository.findAll();
		return document;
	}

	@Override
	public int deleteDocument(int docid) {
		documentRepository.deleteById(docid);
		return docid;
	}

}

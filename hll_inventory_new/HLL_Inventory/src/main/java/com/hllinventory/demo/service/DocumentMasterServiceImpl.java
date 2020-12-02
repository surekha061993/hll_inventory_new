package com.hllinventory.demo.service;

import java.util.List;
import java.util.Optional;

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
	public Optional<DocumentMaster> getDocument(int docid) {
		return documentRepository.findById(docid);
		//return document;
	}

	@Override
	public List<DocumentMaster> updateDocument(DocumentMaster document) {
		documentRepository.save(document);
		List<DocumentMaster> documentt=documentRepository.findAll();
		return documentt;
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

//	@Override
//	public List<DocumentMaster> searchDocumentByName(String docname) {
//		return documentRepository.findByName(docname);
//	}

}

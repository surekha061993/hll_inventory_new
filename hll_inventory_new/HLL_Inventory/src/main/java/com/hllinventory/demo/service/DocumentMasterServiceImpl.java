package com.hllinventory.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hllinventory.demo.dao.DocumentMasterDao;
import com.hllinventory.demo.dao.DocumentMasterRepository;
import com.hllinventory.demo.model.DocumentMaster;

/**
 * @author Surekha Londhe
 * @Date 8-12-2020
 */

@Service
public class DocumentMasterServiceImpl implements DocumentMasterService {

	/*@Autowired
	private DocumentMasterRepository documentRepository;
	*/
	@Autowired
	private DocumentMasterDao masterDao;

	@Override
	public void saveDocument(DocumentMaster document) {
		masterDao.saveDocument(document);
	}

	@Override
	public DocumentMaster getDocument(int docid) {
		 return masterDao.getDocuments(docid);	}	

	@Override
	public void updateDocument(DocumentMaster document) {
		 masterDao.updateDocument(document);
	}

	@Override
	public List<DocumentMaster> getAllDocument() {
		List<DocumentMaster> document=masterDao.getAllDocuments();
		return document;
	}
	
	@Override
	public DocumentMaster deleteDocument(DocumentMaster document) {
		document.setDocDeleteFlag(1);
		masterDao.updateDocument(document);
		return document;
	}

/*	@Override
	public List<DocumentMaster> getAllDocument() {
		List<DocumentMaster> document=documentRepository.findAll();
		return document;
	}
*/
	

	/*@Override
	public DocumentMaster deleteDocument(DocumentMaster document) {
	
		document.setDocDeleteFlag(1);
		documentRepository.save(document);
		return document;
	}
    */
	/*	@Override
	public Optional<DocumentMaster> getDocument(int docid) {
		return documentRepository.findById(docid);
		//return document;
	}
     */
	/*@Override
	public List<DocumentMaster> updateDocument(DocumentMaster document) {
		documentRepository.save(document);
		List<DocumentMaster> documentt=documentRepository.findAll();
		return documentt;
	}*/
	
	
/*	@Override
	public void saveDocument(DocumentMaster document) {
		documentRepository.save(document);
	}
*/

//	@Override
//	public List<DocumentMaster> searchDocumentByName(String docname) {
//		return documentRepository.findByName(docname);
//	}

}

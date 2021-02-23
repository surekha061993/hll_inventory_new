package com.hllinventory.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hllinventory.demo.model.DocumentMaster;
import com.hllinventory.demo.model.DocumentNumberingMaster;

/**
 * @author Surekha Londhe
 * @Date 21-12-2020
 */

@Repository
public class DocumentNumberingMasterDaoImpl implements DocumentNumberingMasterDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveDocument(DocumentNumberingMaster document) {
		Session session=this.sessionFactory.openSession();
		
		Query query = sessionFactory.openSession().createQuery("from DocumentMaster where doc_id=:doc_id");
		query.setParameter("doc_id",document.getDocument().getDoc_id());
		//Integer i=document.getDocument().getDoc_id();
		//System.out.println("id:"+i);
		Integer doc_id = (Integer) query.uniqueResult();
		System.out.println("docid: "+doc_id);
		DocumentMaster doc = new DocumentMaster();
		doc.setDoc_id(doc_id);
		document.setDocument(doc);
		document.setDocNumId(document.getDocNumId());
		
		session.save(document);
		session.beginTransaction().commit();
		session.close();
	}

	@Override
	public DocumentNumberingMaster getDocuments(int docNumId) {
		Session session=this.sessionFactory.openSession();
        DocumentNumberingMaster document=session.find(DocumentNumberingMaster.class, docNumId);
		session.beginTransaction().commit();
		session.close();
		return document;
	}

	@Override
	public void updateDocument(DocumentNumberingMaster document) {
		Session session=this.sessionFactory.openSession();
		session.update(document);
		session.beginTransaction().commit();
		session.close();
	}

	@Override
	public List<DocumentNumberingMaster> getAllDocuments() {
		Session session=this.sessionFactory.openSession();
		Query<DocumentNumberingMaster> query=session.createQuery("from DocumentNumberingMaster where docDeleteFlag='0'");
		List<DocumentNumberingMaster> list=query.getResultList();
		session.beginTransaction().commit();
		session.close();
		return list;
	}
}

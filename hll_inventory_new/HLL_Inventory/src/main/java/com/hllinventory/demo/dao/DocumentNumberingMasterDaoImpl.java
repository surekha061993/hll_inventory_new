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
//        String hql = "from DocumentMaster where docid=:docid";
//		Query query = sessionFactory.openSession().createQuery("select docid from DocumentMaster where docid = :docid");
//		query.setParameter("docid",document.getDocument().getDocid());
//		
//		Integer i=document.getDocument().getDocid();
//		System.out.println("id:"+i);
//		Integer docid = (Integer) query.uniqueResult();
//		System.out.println("docid: "+docid);
//		DocumentMaster lab = new DocumentMaster();
//		lab.setDocid(docid);	
//		document.setDocument(lab);
//		document.setDocNumId(document.getDocNumId());

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

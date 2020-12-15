package com.hllinventory.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.hllinventory.demo.model.DocumentMaster;

/**
 * @author Surekha Londhe
 * @Date 8-12-2020
 */


@Repository
public class DocumentMasterDaoImpl implements DocumentMasterDao {


	@Autowired
	private SessionFactory sessionFactory;
	
	
	public void saveDocument(DocumentMaster document) {
		Session session = this.sessionFactory.openSession();
		session.save(document);
		session.beginTransaction().commit();
		session.close();
	}

	@Override
	public DocumentMaster getDocuments(int docid) {
		Session session = this.sessionFactory.openSession();
		 DocumentMaster doc=session.find(DocumentMaster.class, docid);
	     session.beginTransaction().commit();
	     session.close();
		return doc;
	}

	@Override
	public void updateDocument(DocumentMaster document) {
		Session session = this.sessionFactory.openSession();
		session.update(document);
		session.beginTransaction().commit();
		session.close();
	}

	@Override
	public DocumentMaster deleteDocuments(DocumentMaster document) {
		Session session = this.sessionFactory.openSession();
		session.delete(document);
		session.beginTransaction().commit();
		session.close();
		return document;
	}

	@Override
	public List<DocumentMaster> getAllDocuments() {
		Session session = this.sessionFactory.openSession();
		Query query = session.createQuery("from DocumentMaster where docDeleteFlag = '0'");
		 List<DocumentMaster> document = (List<DocumentMaster>)query.list();
	     session.beginTransaction().commit();
	     session.close();
		return document;
	}

	
	
}

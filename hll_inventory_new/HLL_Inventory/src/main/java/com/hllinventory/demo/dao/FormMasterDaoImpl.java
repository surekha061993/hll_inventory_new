package com.hllinventory.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hllinventory.demo.model.DocumentMaster;
import com.hllinventory.demo.model.FormMaster;

@Repository
public class FormMasterDaoImpl implements FormMasterDao {

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public void saveForm(FormMaster form) {
		Session session=this.sessionFactory.openSession();
		session.save(form);
		session.beginTransaction().commit();
		session.close();
	}
	@Override
	public int deleteForms(int formId) {
		Session session = this.sessionFactory.openSession();
		session.delete(formId);
		session.beginTransaction().commit();
		session.close();
		return formId;
	}
	@Override
	public List<FormMaster> getAllForm() {
		Session session = this.sessionFactory.openSession();
		Query query = session.createQuery("from FormMaster where formDeleteFlag = '0'");
		 List<FormMaster> form = (List<FormMaster>)query.list();
	     session.beginTransaction().commit();
	     session.close();
		return form;
	}

}

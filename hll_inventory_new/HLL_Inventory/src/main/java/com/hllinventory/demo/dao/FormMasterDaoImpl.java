package com.hllinventory.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.hllinventory.demo.model.FormMaster;

/**
 * @author Surekha Londhe
 * @Date 16-12-2020
 */
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
	public FormMaster deleteForms(FormMaster form) {
		Session session = this.sessionFactory.openSession();
		session.delete(form);
		session.beginTransaction().commit();
		session.close();
		return form;
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

	@Override
	public boolean update(FormMaster form) {
		Session session = this.sessionFactory.openSession();
		session.update(form);
		session.beginTransaction().commit();
		session.close();
		return true;
	}
	@Override
	public FormMaster getFormMaster(int formId) {
		Session session=this.sessionFactory.openSession();
		FormMaster form=session.find(FormMaster.class, formId);
		session.beginTransaction().commit();
		session.close();
		return form;
	}

}

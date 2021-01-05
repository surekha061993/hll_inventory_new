package com.hllinventory.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hllinventory.demo.model.TaxMaster;


/**
 * @author Surekha Londhe
 * @Date 24-12-2020
 */
@Repository
public class TaxMasterDaoImpl implements TaxMasterDao {

	@Autowired
	private SessionFactory sessionfactory;
	
	@Override
	public void saveTax(TaxMaster tax) {
		Session session=this.sessionfactory.openSession();
		session.save(tax);
		session.beginTransaction().commit();
		session.close();
	}

	@Override
	public TaxMaster getTax(Integer tax_id) {
		Session session=this.sessionfactory.openSession();
		TaxMaster taxx=session.find(TaxMaster.class, tax_id);
		session.beginTransaction().commit();
		session.close();
		return taxx;
	}

	@Override
	public List<TaxMaster> getAllTax() {
		Session session=this.sessionfactory.openSession();
		Query<TaxMaster> query=session.createQuery("from TaxMaster where tax_delete_flag='0'");
		List<TaxMaster> tax=query.list();
		session.beginTransaction().commit();
		return tax;
	}

	@Override
	public void updateTax(TaxMaster tax) {
		Session session=this.sessionfactory.openSession();
		session.update(tax);
		session.beginTransaction().commit();
		session.close();
	}
  }

package com.hllinventory.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hllinventory.demo.model.DocumentMaster;
import com.hllinventory.demo.model.UomMaster;

@Repository
public class UomMasterDaoImpl implements UomMasterDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveUom(UomMaster uom) {
		Session session = this.sessionFactory.openSession();
		session.save(uom);
		session.beginTransaction().commit();
		session.close();
	}

	@Override
	public List<UomMaster> getAllUom() {
		Session session = this.sessionFactory.openSession();
		Query query = session.createQuery("from UomMaster where uomDeleteFlag = '0'");
		List<UomMaster> uom = (List<UomMaster>)query.list();
		 session.beginTransaction().commit();
	     session.close();
		return uom;
	}

	@Override
	public UomMaster getUoms(int uomid) {
		Session session = this.sessionFactory.openSession();
		UomMaster uom=session.find(UomMaster.class, uomid);
	    session.beginTransaction().commit();
	    session.close();
		return uom;
	}

	@Override
	public void updateUom(UomMaster uom) {
		Session session = this.sessionFactory.openSession();
		session.update(uom);
		session.beginTransaction().commit();
		session.close();
	}

	@Override
	public UomMaster deleteUom(UomMaster uom) {
		Session session = this.sessionFactory.openSession();
		session.delete(uom);
		session.beginTransaction().commit();
		session.close();
		return uom;
	}

}

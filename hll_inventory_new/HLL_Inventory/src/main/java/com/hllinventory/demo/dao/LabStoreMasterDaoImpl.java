package com.hllinventory.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hllinventory.demo.model.LabStoreMaster;
/**
 * @author Surekha Londhe
 * @Date 28-12-2020
 */
@Repository
public class LabStoreMasterDaoImpl implements LabStoreMasterDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveLabStoreMaster(LabStoreMaster labstore) {
		Session session=sessionFactory.openSession();
		session.save(labstore);
		session.beginTransaction().commit();
	}

	@Override
	public LabStoreMaster getLabStoreMaster(Integer subinventory_Id) {
		Session session=sessionFactory.openSession();
		LabStoreMaster labstore=session.find(LabStoreMaster.class, subinventory_Id);
		session.beginTransaction().commit();
		return labstore;
	}

	@Override
	public List<LabStoreMaster> getAllLabStoreMaster() {
		Session session=sessionFactory.openSession();
		Query<LabStoreMaster> query=session.createQuery("from LabStoreMaster where status='Y'");
		List<LabStoreMaster> list=query.getResultList();
		return list;
	}

	@Override
	public void updateLabStoreMaster(LabStoreMaster labstore) {
		Session session=sessionFactory.openSession();
		session.update(labstore);
		session.beginTransaction().commit();
	}
}

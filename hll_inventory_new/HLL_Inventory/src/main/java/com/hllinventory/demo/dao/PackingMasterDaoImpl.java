package com.hllinventory.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hllinventory.demo.model.PackingMaster;

/**
 * @author Surekha Londhe
 * @Date 16-12-2020
 */
@Repository
public class PackingMasterDaoImpl implements PackingMasterDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void savePacking(PackingMaster packing) {
		Session session=this.sessionFactory.openSession();
		session.save(packing);
		session.beginTransaction().commit();
		session.close();
	}

	@Override
	public PackingMaster getPacking(Integer packId) {
		Session session=this.sessionFactory.openSession();
		PackingMaster packing=session.find(PackingMaster.class, packId);
		session.beginTransaction().commit();
		session.close();
		return packing;
	}

	@Override
	public List<PackingMaster> getAllPacking() {
		Session session=this.sessionFactory.openSession();
		Query<PackingMaster> query=session.createQuery("from PackingMaster where packDeleteFlag='0'");
		List<PackingMaster> packing=query.list();
		session.beginTransaction().commit();
		return packing;
	}

	@Override
	public void updatePacking(PackingMaster packing) {
		Session session=this.sessionFactory.openSession();
		session.update(packing);
		session.beginTransaction().commit();
		session.close();
	}

	@Override
	public PackingMaster deletePacking(PackingMaster packing) {
		Session session=this.sessionFactory.openSession();
		session.delete(packing);
		session.beginTransaction().commit();
		session.close();
		return packing;
	}

}

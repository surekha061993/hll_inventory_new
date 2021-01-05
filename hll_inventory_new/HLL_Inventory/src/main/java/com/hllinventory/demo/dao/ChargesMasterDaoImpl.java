package com.hllinventory.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hllinventory.demo.model.ChargesMaster;
/**
 * @author Surekha Londhe
 * @Date 20-12-2020
 */
@Repository
public class ChargesMasterDaoImpl implements ChargesMasterDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveChargesMaster(ChargesMaster charges) {
		Session session=sessionFactory.openSession();
		session.save(charges);
		session.beginTransaction().commit();
	}

	@Override
	public ChargesMaster getChargesMaster(Integer inv_charges_Id) {
		Session session=sessionFactory.openSession();
		ChargesMaster charges=session.find(ChargesMaster.class, inv_charges_Id);
		session.beginTransaction().commit();
		return charges;
	}

	@Override
	public List<ChargesMaster> getAllChargesMaster() {
		Session session=sessionFactory.openSession();
		Query<ChargesMaster> query=session.createQuery("from ChargesMaster where status='Y'");
		List<ChargesMaster> list=query.list();
		return list;
	}

	@Override
	public void updateChargesMaster(ChargesMaster charges) {
		Session session=sessionFactory.openSession();
		session.update(charges);
		session.beginTransaction().commit();
	}
}

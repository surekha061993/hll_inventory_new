package com.hllinventory.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hllinventory.demo.model.ManufacturerMaster;
import com.hllinventory.demo.service.ManufacturerMasterService;
/**
 * @author Surekha Londhe
 * @Date 18-12-2020
 */

@Repository
public class ManufacturerMasterDaoImpl implements ManufacturerMasterDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveManufacturer(ManufacturerMaster manufacture) {
		Session session=this.sessionFactory.openSession();
		session.save(manufacture);
		session.beginTransaction().commit();
		session.close();
	}

	@Override
	public ManufacturerMaster getManufacturer(Integer manufacturerId) {
		Session session=this.sessionFactory.openSession();
		ManufacturerMaster manufacturer=session.find(ManufacturerMaster.class, manufacturerId);
		session.beginTransaction().commit();
		session.close();
		return manufacturer;
	}

	@Override
	public List<ManufacturerMaster> getAllManufacturer() {
	 Session session=this.sessionFactory.openSession();
	 Query<ManufacturerMaster> query=session.createQuery("from ManufacturerMaster where manufacturerStatus='Y'");	
	 List<ManufacturerMaster> manufacture=query.getResultList();
	 session.beginTransaction().commit();
	 session.close();
	 return manufacture;
	}

	@Override
	public void updateManufacturer(ManufacturerMaster manufacture) {
		Session session=this.sessionFactory.openSession();
		session.update(manufacture);
		session.beginTransaction().commit();
		session.close();
	}

}

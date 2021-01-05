package com.hllinventory.demo.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hllinventory.demo.model.HospitalMaster;
/**
 * @author Surekha Londhe
 * @Date 29-12-2020
 */
@Repository
public class HospitalMasterDaoImpl implements HospitalMasterDao {

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public void saveHospitalMaster(HospitalMaster hospital) {
		Session session=sessionFactory.openSession();
		session.save(hospital);
		session.beginTransaction().commit();
	}

	@Override
	public HospitalMaster getHospitalMaster(Integer idinv_hospital_details) {
		Session session=sessionFactory.openSession();
		HospitalMaster hospital=session.find(HospitalMaster.class, idinv_hospital_details);
		session.beginTransaction().commit();
		return hospital;
	}

	@Override
	public List<HospitalMaster> getAllHospitalMaster() {
		Session session=sessionFactory.openSession();
		Query<HospitalMaster> query=session.createQuery("from HospitalMaster where invHospitalDeleteFlag = '0'");
		List<HospitalMaster> list=query.list();
		return list;
	}

	@Override
	public void updateHospitalMaster(HospitalMaster hospital) {
		Session session=sessionFactory.openSession();
		session.update(hospital);
		session.beginTransaction().commit();
	}

}

package com.hllinventory.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hllinventory.demo.model.FinancialYearMaster;
/**
 * @author Surekha Londhe
 * @Date 17-12-2020
 */

@Repository
public class FinancialYearDaoImpl implements FinancialYearDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveFinancialYear(FinancialYearMaster finYear) {
		Session session = this.sessionFactory.openSession();
		session.save(finYear);
		session.beginTransaction().commit();
		session.close();
	}

	@Override
	public FinancialYearMaster getFinancialYear(int finYearId) {
		Session session = this.sessionFactory.openSession();
		FinancialYearMaster financial=session.find(FinancialYearMaster.class, finYearId);
	     session.beginTransaction().commit();
	     session.close();
		return financial;
	}

	@Override
	public void updateFinancialYear(FinancialYearMaster financialYear) {
		Session session = this.sessionFactory.openSession();
		session.update(financialYear);
		session.beginTransaction().commit();
		session.close();	
	}

	@Override
	public List<FinancialYearMaster> getAllFinancialYear() {
		Session session = this.sessionFactory.openSession();
		Query query = session.createQuery("from FinancialYearMaster fin where fin.yearDeleteFlag = '0'");
		 List<FinancialYearMaster> financialYear = (List<FinancialYearMaster>)query.list();
	     session.beginTransaction().commit();
	     session.close();
		return financialYear;
	}

}

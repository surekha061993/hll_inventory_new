package com.hllinventory.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hllinventory.demo.model.InventoryFinancialYear;

/**
 * @author Surekha Londhe
 * @Date 14-12-2020
 */
@Repository
public class InventoryFinancialYearDaoImpl implements InventoryFinancialYearDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveFinancialYear(InventoryFinancialYear finYear) {
		Session session = this.sessionFactory.openSession();
		session.save(finYear);
		session.beginTransaction().commit();
		session.close();
	}

	@Override
	public InventoryFinancialYear getFinancialYear(int finYearId) {
		Session session = this.sessionFactory.openSession();
		InventoryFinancialYear financial=session.find(InventoryFinancialYear.class, finYearId);
	     session.beginTransaction().commit();
	     session.close();
		return financial;
	}

	@Override
	public void updateFinancialYear(InventoryFinancialYear financialYear) {
		Session session = this.sessionFactory.openSession();
		session.update(financialYear);
		session.beginTransaction().commit();
		session.close();	
	}

	@Override
	public InventoryFinancialYear deleteFinancialYear(InventoryFinancialYear financialYear) {
		Session session = this.sessionFactory.openSession();
		session.delete(financialYear);
		session.beginTransaction().commit();
		session.close();
		return financialYear;
	}

	@Override
	public List<InventoryFinancialYear> getAllFinancialYear() {
		Session session = this.sessionFactory.openSession();
		Query query = session.createQuery("from InventoryFinancialYear fin where fin.finDeleteFlag = '0'");
		 List<InventoryFinancialYear> financialYear = (List<InventoryFinancialYear>)query.list();
	     session.beginTransaction().commit();
	     session.close();
		return financialYear;
	}

}

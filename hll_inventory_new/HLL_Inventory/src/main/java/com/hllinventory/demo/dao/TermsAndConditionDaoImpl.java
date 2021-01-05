package com.hllinventory.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hllinventory.demo.model.TermsAndCondition;
import com.hllinventory.demo.model.TermsAndCondition;

@Repository
public class TermsAndConditionDaoImpl implements TermsAndConditionDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveTermsAndCondition(TermsAndCondition terms) {
		Session session=sessionFactory.openSession();
		session.save(terms);
		session.beginTransaction().commit();
		session.close();
	}

	@Override
	public TermsAndCondition getTermsAndCondition(Integer inv_termsandCondition_master_id) {
		Session session=sessionFactory.openSession();
		TermsAndCondition terms=session.find(TermsAndCondition.class, inv_termsandCondition_master_id);
		session.beginTransaction().commit();
		session.close();
		return terms;
	}

	@Override
	public List<TermsAndCondition> getAllTermsAndCondition() {
		Session session=this.sessionFactory.openSession();
		Query<TermsAndCondition> query=session.createQuery("from TermsAndCondition where termsandConditionMasterDeleteFlag='0'");
		List<TermsAndCondition> terms=query.list();
		session.beginTransaction().commit();
		return terms;
		
	}

	@Override
	public void updateTermsAndCondition(TermsAndCondition terms) {
		Session session=this.sessionFactory.openSession();
		session.update(terms);
		session.beginTransaction().commit();
		session.close();
	}

}

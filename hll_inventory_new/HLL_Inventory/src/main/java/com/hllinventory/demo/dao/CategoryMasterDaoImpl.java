package com.hllinventory.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hllinventory.demo.model.CategoryMaster;

/**
 * @author Surekha Londhe
 * @Date 18-12-2020
 */
@Repository
public class CategoryMasterDaoImpl implements CategoryMasterDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveCategory(CategoryMaster category) {
		Session session = this.sessionFactory.openSession();
		session.save(category);
		session.beginTransaction().commit();
		session.close();
	}

	@Override
	public CategoryMaster getCategory(int categoryId) {
		Session session = this.sessionFactory.openSession();
		CategoryMaster category = session.find(CategoryMaster.class, categoryId);
		session.beginTransaction().commit();
		return category;
	}

	@Override
	public void updateCategory(CategoryMaster category) {
		Session session = this.sessionFactory.openSession();
		session.update(category);
		session.beginTransaction().commit();
		session.close();
	}

	@Override
	public List<CategoryMaster> getAllCategory() {
		Session session = this.sessionFactory.openSession();
		Query query = session.createQuery("from CategoryMaster where categoryStatus='Y'");
		List<CategoryMaster> list = query.getResultList();
		session.beginTransaction().commit();
		session.close();
		return list;
	}

}

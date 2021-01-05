package com.hllinventory.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.hllinventory.demo.model.WarehouseMaster;

@Repository
public class WarehouseMasterDaoImpl implements WarehouseMasterDao{

	@Autowired
	private SessionFactory sessionfactory;
	
	@Override
	public void saveWarehouse(WarehouseMaster warehouse) {
		Session session=this.sessionfactory.openSession();
		session.save(warehouse);
		session.beginTransaction().commit();
		session.close();
	}
	@Override
	public WarehouseMaster getWarehouse(Integer warehouse_id) {
		Session session=this.sessionfactory.openSession();
		WarehouseMaster warehouse=session.find(WarehouseMaster.class, warehouse_id);
		session.beginTransaction().commit();
		session.close();
		return warehouse;
	}

	@Override
	public List<WarehouseMaster> getAllWarehouse() {
		Session session=this.sessionfactory.openSession();
		Query<WarehouseMaster> query=session.createQuery("from WarehouseMaster where warehouse_delete_flag='0'");
		List<WarehouseMaster> warehouse=query.list();
		session.beginTransaction().commit();
		return warehouse;
	}

	@Override
	public void updateWarehouse(WarehouseMaster warehouse) {
		Session session=this.sessionfactory.openSession();
		session.update(warehouse);
		session.beginTransaction().commit();
		session.close();
	}

}

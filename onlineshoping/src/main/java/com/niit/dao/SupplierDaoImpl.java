package com.niit.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Supplier;
@Repository("supplierDAO")
public class SupplierDaoImpl implements SupplierDao {
	@Autowired
	private SessionFactory sessionfactory;
	
	public void ProducDaoImpl(SessionFactory session)
	{
		sessionfactory=session;
	}
	@Transactional
	public List<Supplier> getAllSupplier() {
		// TODO Auto-generated method stub
		Session session=sessionfactory.getCurrentSession();
		Query query=session.createQuery("from Supplier");
		return query.list();
	}
	@Transactional
	public Supplier getSupplier(int supid) {
		// TODO Auto-generated method stub
		Session session=sessionfactory.getCurrentSession();
		Supplier supplier=(Supplier)session.get(Supplier.class, supid);
		return supplier;
	}
	@Transactional
	public void deleteSupplier(int supid) {
		// TODO Auto-generated method stub
		Session session=sessionfactory.getCurrentSession();
		Supplier supplier=(Supplier)session.get(Supplier.class, supid);
		session.delete(supplier);
	}
@Transactional
	public void addorupdatesupplier(Supplier su) {
		// TODO Auto-generated method stub
		Session s=sessionfactory.getCurrentSession();
		s.save(su);
	}

}

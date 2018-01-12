package com.niit.dao;

import java.util.List;

import javax.validation.OverridesAttribute;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Product;
@Repository("productDAO")
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private SessionFactory sessionfactory;
	
	public void ProducDaoImpl(SessionFactory session)
	{
		sessionfactory=session;
	}
	@Transactional
	public List<Product> getAllProduct() {
		Session session=sessionfactory.getCurrentSession();
		Query query=session.createQuery("from Product");
		return query.list();
	}
	@Transactional
	public Product getProduct(int id) {
		Session session=sessionfactory.getCurrentSession();
		Product product=(Product)session.get(Product.class, id);
		return product;
	}
	
	@Transactional
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		Session session=sessionfactory.getCurrentSession();
		Product product=(Product)session.get(Product.class, id);
		session.delete(product);
	}
	@Transactional
	public void addorupdateproduct(Product p) {
		// TODO Auto-generated method stub
		//String InsertQuery = "INSERT INTO PERSON" + "(id, productname, productdescription, quantity, price) values" + "(?,?,?,?,?)";
		Session s=sessionfactory.getCurrentSession();
		s.saveOrUpdate(p);
	}
}

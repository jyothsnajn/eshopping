package com.niit.dao;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Category;
@Repository("cateoryDAO")
public class CategoryDaoImpl implements CategoryDao {
	@Autowired
	private SessionFactory sessionfactory;
	public CategoryDaoImpl(SessionFactory session)
	{
		sessionfactory=session;
	}
	@Transactional
	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		Session session=sessionfactory.getCurrentSession();
		Query query=session.createQuery("from Category");
		return query.list();
	}
	@Transactional
	public Category getCategory(int id) {
		// TODO Auto-generated method stub
		Session session=sessionfactory.getCurrentSession();
		Category category=(Category)session.get(Category.class, id);
		return category;
	}
	@Transactional
	public void deleteCategory(int id) {
		// TODO Auto-generated method stub
		Session session=sessionfactory.getCurrentSession();
		Category category=(Category)session.get(Category.class, id);
		session.delete(category);
	}
	@Transactional
	public void addorupdatecategory(Category c) {
		// TODO Auto-generated method stub
		Session s=sessionfactory.getCurrentSession();
		s.save(c);
	}
}

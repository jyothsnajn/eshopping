package com.niit.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.User;
@Repository("userDAO")
public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory sessionfactory;
	private Serializable userid;
	
	 public UserDaoImpl(SessionFactory session)
	{
		sessionfactory=session;
	}
	@Transactional
	public void addUser(User u) {
		// TODO Auto-generated method stub
		Session s=sessionfactory.getCurrentSession();
		s.save(u);
	}
	@Transactional
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		Session session=sessionfactory.getCurrentSession();
		Query query=session.createQuery("from User");
		return query.list();
	}
	@Transactional
	public void deleteUser(String username) {
		// TODO Auto-generated method stub
		Session session=sessionfactory.getCurrentSession();
		User user=(User)session.get(User.class, username);
		session.delete(user);
	}
	@Transactional
	public User updateUser(User u) {
		// TODO Auto-generated method stub
		Session s=sessionfactory.getCurrentSession();
		s.saveOrUpdate(u);
		return null;
	}
	@Transactional
	public User getUser(String userid) {
		// TODO Auto-generated method stub
		Session session=sessionfactory.getCurrentSession();
		User user=(User)session.get(User.class, userid);
		return user;
	}

}

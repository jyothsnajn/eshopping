package com.niit.dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Cart;
@Repository("cartDAO")
public class CartDaoImpl implements CartDao {
	@Autowired
	private Cart cart;
	
	@Autowired
	private SessionFactory sessionfactory;
	
	public CartDaoImpl(SessionFactory session)
	{
		sessionfactory=session;
	}
	@Transactional
	@Override
	public Cart getCart(String cart_id) {
		// TODO Auto-generated method stub
		Session session=sessionfactory.getCurrentSession();
		Cart cart=(Cart)session.get(Cart.class, cart_id);
		return cart;
	}
	@Transactional
	@Override
	public void addorupdatecart(Cart cart) {
		// TODO Auto-generated method stub
		Session s=sessionfactory.getCurrentSession();
		s.save(cart);
	}
	@Transactional
	@Override
	public void delete(int cart_id) {
		// TODO Auto-generated method stub
		Session session=sessionfactory.getCurrentSession();
		Cart cart=(Cart)session.get(Cart.class, cart_id);
		session.delete(cart);
	}
	@Transactional
	@Override
	public List<Cart> getAllCart(String s) {
String hql = "from Cart where userID = " + "'" + s + "'";
		
		Query query = sessionfactory.getCurrentSession().createQuery(hql);
		
		List<Cart> cartlistuser = query.list();
		
		if(cartlistuser!=null || !cartlistuser.isEmpty()){
			return cartlistuser;
		}
		return null;
	}

}

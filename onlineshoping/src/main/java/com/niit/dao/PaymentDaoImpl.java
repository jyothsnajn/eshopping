package com.niit.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Payment;

@Repository("paymentDAO")
public class PaymentDaoImpl implements PaymentDao {
	@Autowired
	private Payment payment;
	
	@Autowired
	private SessionFactory sessionfactory;

	public PaymentDaoImpl(SessionFactory session)
	{
		sessionfactory=session;
	}
	@Override
	@Transactional
	public Payment getPayment(int payment_id) {
		// TODO Auto-generated method stub
		Session session=sessionfactory.getCurrentSession();
		Payment payment=(Payment)session.get(Payment.class, payment_id);
		return payment;
	}

	@Override
	@Transactional
	public List<Payment> getAllPayment(int payment_id) {
		// TODO Auto-generated method stub
		Session session=sessionfactory.getCurrentSession();
		Query query=session.createQuery("from Payment");
		return query.list();
	}

	@Override
	@Transactional
	public void addorupdatepayment(Payment payment) {
		// TODO Auto-generated method stub
		Session s=sessionfactory.getCurrentSession();
		s.save(payment);
	}

	@Override
	@Transactional
	public void delete(int payment_id) {
		// TODO Auto-generated method stub
		Session session=sessionfactory.getCurrentSession();
		Payment payment=(Payment)session.get(Payment.class, payment_id);
		session.delete(payment);
	}
	
}

package com.niit.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.model.Payment;

@Repository("paymentDAO")
public interface PaymentDao {
	public Payment getPayment(int payment_id);
	public List<Payment> getAllPayment(int payment_id);
	public void addorupdatepayment(Payment payment);
	public void delete(int payment_id);
}

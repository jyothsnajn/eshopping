package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.dao.PaymentDao;
import com.niit.model.Payment;

@Controller
public class PaymentController {
	@Autowired
	PaymentDao paymentDAO;
	
	@RequestMapping(value="/Payment")
	public String paymentMethod1()
	{		
		return "Payment";
	}
	@ModelAttribute("payment")
	public Payment p1()
	{
		return new Payment();
	}
	@RequestMapping(value="/pay",method=RequestMethod.POST)
	public String paymentMethod2(@ModelAttribute("payment")Payment payment)
	{
		paymentDAO.addorupdatepayment(payment);
		return "ThankYouPage";
	}
	
}

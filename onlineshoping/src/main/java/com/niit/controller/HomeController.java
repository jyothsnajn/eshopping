package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.dao.ProductDao;
import com.niit.model.Product;
@Controller
public class HomeController {
	@Autowired
	Product product;
	@Autowired
	ProductDao productDAO;
	@RequestMapping("/")
	public String function1()
	{
		return "UserHome";
	}
	@RequestMapping(value="/Admin")
	public String name1()
	{
		return "Admin";
	}
	@RequestMapping(value="/Supplier")
	public String name2()
	{
		return "Supplier";
	}
	
	@RequestMapping(value="/AdminHome")
	public String name4()
	{
		return "AdminHome";
	}
	@RequestMapping(value="/LoginPage")
	public String name5()
	{
		return "LoginPage";
	}
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String home(Model model)
	{
		
		model.addAttribute("product",product );
		model.addAttribute("hproList", this.productDAO.getAllProduct());
		return "AdminHome";}
	@RequestMapping(value="/AboutUs")
	public String name6()
	{
		return "AboutUs";
	}
	@RequestMapping("/home")
	private String pub() {
		return "AdminHome";
	}
	@RequestMapping(value="/ContactUs")
	public String name7()
	{
		return "Contact Us";
	}
}

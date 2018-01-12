package com.niit.controller;


import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.dao.CartDao;
import com.niit.dao.ProductDao;
import com.niit.model.Cart;
import com.niit.model.Product;
import com.niit.model.User;
@Controller
public class CartController {
	@Autowired
	Cart cart;
	
	@Autowired
	CartDao cartDAO;
	
	@Autowired
	ProductDao productDAO;
	
	
	
	@RequestMapping(value="/Addtocart-{id}")
	public String cartMethod1(@PathVariable("id") int id,Principal principal,Model model)
	{	
		
		Product product =	 productDAO.getProduct(id);
		System.out.println(product.getId());
		 Cart cart = new Cart();
		 cart.setPrice(product.getPrice());
		 cart.setProductName(product.getProductname());
		 cart.setCartproduct_id(product.getId());
		 cart.setQuantity(1);
		 cart.setUserID(principal.getName());  //  id should keep session and use the same id
		 	cartDAO.addorupdatecart(cart);
			//return "redirect:/views/home.jsp";
			System.out.println("connect to controller");
			
			model.addAttribute("cart", new Cart());
			model.addAttribute("cartList", this.cartDAO.getAllCart(principal.getName()));
			
			
			int i,j=0;
			int s=0;
			int n=cartDAO.getAllCart(principal.getName()).size();
			System.out.println(n);
			for(i=0;i<n;i++)
			{
				s=(int) (s+cartDAO.getAllCart(principal.getName()).get(i).getPrice());
				
			}
			System.out.println(s);
			model.addAttribute("SUM", s);
			
			
			return "redirect:/userCart";
			
			
		}
	@RequestMapping(value="/userCart")
	public String cartMethod2(Model model,Principal principal,@RequestParam(value="SUM", required = false) String sum)
	{
		model.addAttribute("total",sum);
		model.addAttribute("cartpList", this.cartDAO.getAllCart(principal.getName()));
		int i,j=0;
		int s=0;
		int n=cartDAO.getAllCart(principal.getName()).size();
		System.out.println(n);
		for(i=0;i<n;i++)
		{
			s=(int) (s+cartDAO.getAllCart(principal.getName()).get(i).getPrice());
			
		}
		System.out.println(s);
		model.addAttribute("SUM", s);
		return "Cart";
	}
	@RequestMapping(value="/remove-{id}")
	public String deleteCart(@PathVariable("id") int id)
	{
		cartDAO.delete(id);
		
		return "redirect:/userCart";
	}
	
}

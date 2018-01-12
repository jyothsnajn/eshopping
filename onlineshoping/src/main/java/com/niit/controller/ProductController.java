package com.niit.controller;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.ProductDao;
import com.niit.model.FileUtil;
import com.niit.model.Product;

@Controller
public class ProductController {
	@Autowired
	ProductDao productDAO;
	
	@Autowired
	Product product;
	private Path path;

	@RequestMapping(value="/Product2")
	public String name()
	{
		
		return "Product2";
	}
	
	@ModelAttribute("product")
	public Product createpro()
	{
		return new Product();
	}
	
	@RequestMapping(value="/addpro", method=RequestMethod.POST)
	public String save(@ModelAttribute("product") Product product,HttpServletRequest request, Object image)
	{
		System.out.println(product.getProductname());
		System.out.println(product.getPrice());
		productDAO.addorupdateproduct(product);
		MultipartFile file=product.getImage();
		/**/
		String rootDirectory=request.getSession().getServletContext().getRealPath("/");
		/*path=Paths.get(rootDirectory + "\\WEB-INF\\resources\\images\\"+product.getPro_id()+".jpg");*/
		path = Paths.get(rootDirectory + "\\resources\\images\\" + product.getId()+".jpg");
		
		if(file!=null && !file.isEmpty()){
			try{
				System.out.println(file);
				file.transferTo(new File(path.toString()));
				System.out.println("Image Uploaded to Product.....");
			}catch(Exception e)
			{
				e.printStackTrace();
				throw new RuntimeException("image saving failed ",e);
			}
		}
		
		System.out.println("path converting to string"+path.toString());
		FileUtil.upload(path.toString(), file, product.getId() + ".jpg");
		System.out.println("path converted to string" + product.getId());
		return "redirect:/plist";
	}
	@RequestMapping("/plist")
	public String AllProducts(Model m)
	{
		List<Product> productlist=productDAO.getAllProduct();
		m.addAttribute("allproducts",productlist);
		return "Product2";
	}
	@RequestMapping("/Edit product-{id}")
	public String editProduct(@PathVariable("id") int id, Model m)
	{
		this.product=productDAO.getProduct(id);
		System.out.println(this.product.getId());
		m.addAttribute("product", productDAO.getProduct(id));
		return "Product2";
	}
	@RequestMapping("/updatepro-{id}")
	public String modifyProduct(@PathVariable("id") int id, Model m)
	{
		this.product=this.productDAO.getProduct(id);
		m.addAttribute("product", productDAO.getProduct(id));
		System.out.println(productDAO.getProduct(id).getId());
		return "Product2";		
	}
	@RequestMapping("/deletepro-{id}")
	public String deleteCategory(@PathVariable("id") int id)
	{
		this.productDAO.deleteProduct(id);
		return "redirect:/plist";
	}
}

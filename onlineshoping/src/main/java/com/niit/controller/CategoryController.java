package com.niit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.dao.CategoryDao;
import com.niit.model.*;
@Controller
public class CategoryController {
	@Autowired
	CategoryDao categoryDAO;
	
	@Autowired
	Category category;
	
	@RequestMapping("/Category")
	public String name()
	{
		return "Category";
	}

	@ModelAttribute("addcategory")
	public Category create()
	{
		return new Category();
	}
	@RequestMapping(value="/category", method=RequestMethod.POST)
	public String save(@ModelAttribute("category") Category category, Model p)
	{
		System.out.println(category.getCategoryname());
		System.out.println(category.getCatid());
		categoryDAO.addorupdatecategory(category);
		List<Category> categorylist=categoryDAO.getAllCategory();
		p.addAttribute("allcategory",categorylist);
		return "Category";
	}
	@RequestMapping("/clist")
	public String AllProducts(Model m)
	{
		List<Category> categorylist=categoryDAO.getAllCategory();
		m.addAttribute("allcategory",categorylist);
		return "Category";
	}
	@RequestMapping("editcategory-{catid}")
	public String modifyCategory(@PathVariable("catid") int catid, Model m)
	{
		this.category=this.categoryDAO.getCategory(catid);
		m.addAttribute("category", this.category);
		System.out.println(categoryDAO.getCategory(catid).getCatid());
		return "Category";
	}
	@RequestMapping("/delete-{catid}")
	public String deleteCategory(@PathVariable("catid") int catid)
	{
		this.categoryDAO.deleteCategory(catid);
		return "redirect:/clist";
	}
}

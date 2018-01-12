package com.niit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.dao.SupplierDao;
import com.niit.model.Supplier;




@Controller
public class SupplierController {
	@Autowired
	SupplierDao supplierDAO;
	
	@Autowired
	Supplier supplier;
	
	@RequestMapping(value="/Supplierhome")
	public String supMethod1()
	{
		return "Supplier";
	}
	
	@ModelAttribute("supplier")
	public Supplier createSup()
	{
		return new Supplier();
	}
	@RequestMapping(value="/addsup",method=RequestMethod.POST)
	public String save(@ModelAttribute("supplier") Supplier supplier, Model m)
	{
		supplierDAO.addorupdatesupplier(supplier);
		
		return "redirect:/sulist";
	}
	@RequestMapping("/sulist")
	public String allSupplier(Model m)
	{
		List<Supplier> supplierlist=supplierDAO.getAllSupplier();
		m.addAttribute("allSupplier", supplierlist);
		return "Supplier";
	}
	@RequestMapping("updatesup-{supid}")
	public String modifySupplier(@PathVariable("supid") int supid, Model m) 
	{
		this.supplier=this.supplierDAO.getSupplier(supid);
		m.addAttribute("supplier", supplierDAO.getSupplier(supid));
		System.out.println(supplierDAO.getSupplier(supid).getSupid());
		return "Supplier";
	}
	@RequestMapping("deletesup-{supid}")
	public String deleteSuplier(@PathVariable("supid") int supid)
	{
		this.supplierDAO.deleteSupplier(supid);
		return "redirect:/sulist";
	}
}

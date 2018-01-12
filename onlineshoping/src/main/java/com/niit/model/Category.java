package com.niit.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

import antlr.collections.List;
@Entity
@Component
public class Category {
	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private int catid;
	 private String categoryname;
	
	 public int getCatid() {
		return catid;
	}
	public void setCatid(int catid) {
		this.catid = catid;
	}
	public String getCategoryname()
	 {
		 return categoryname;
	 }
	 public void setCategoryname(String categoryname)
	 {
		 this.categoryname=categoryname;
	 }
}

package com.niit.dao;
import java.util.List;

import org.springframework.stereotype.Repository;


import com.niit.model.Category;
@Repository("categoryDAO")
public interface CategoryDao {
	List<Category> getAllCategory();
	Category getCategory(int id);
	void deleteCategory(int id);
	void addorupdatecategory(Category c);
}

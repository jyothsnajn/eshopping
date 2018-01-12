package com.niit.dao;
import java.util.List;
import com.niit.model.Product;
import org.springframework.stereotype.Repository;

@Repository("productDAO")

public interface ProductDao {
	List<Product> getAllProduct();
	Product getProduct(int id);
	void deleteProduct(int id);
	void addorupdateproduct(Product p);
}

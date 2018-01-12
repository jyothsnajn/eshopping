package com.niit.dao;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.model.Cart;
import com.niit.model.Product;
@Repository("cartDAO")
public interface CartDao {
	public Cart getCart(String cart_id);
	public List<Cart> getAllCart(String uid);
	public void addorupdatecart(Cart cart);
	public void delete(int cartproduct_id);
}

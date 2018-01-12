package com.niit.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.model.User;

@Repository("userDAO")
public interface UserDao {
	public void addUser(User u);
	public List<User> getAllUsers();
	public void deleteUser(String username);
	public User updateUser(User u);
	public User getUser(String username);
}

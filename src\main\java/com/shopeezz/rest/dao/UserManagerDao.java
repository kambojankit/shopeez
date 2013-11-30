package com.shopeezz.rest.dao;

import java.util.List;

import com.shopeezz.rest.model.User;

public interface UserManagerDao {

	public User fetchUserById(Integer id);
	public List fetchAllUsers();
	public void insertUser(User user);
	public void updateUser(User user);
	public void deleteUser(User user);
}

package com.mas.spring.service;

import java.util.List;

import com.mas.spring.model.User;

public interface UserService {
	
	public User findById(Long id);

	public User findByName(String name);

	public void saveUser(User user);

	public void updateUser(User user);

	public void deleteUserById(Long id);

	public void deleteAllUsers();

	public List<User> findAllUsers();

	public boolean isUserExist(User user);
}

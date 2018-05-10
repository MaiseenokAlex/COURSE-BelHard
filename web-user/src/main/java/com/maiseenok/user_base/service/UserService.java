package com.maiseenok.user_base.service;

import java.util.List;

import com.maiseenok.user_base.model.User;

public interface UserService {
	public List<User> getAllUsers();
	public void updateUser(int id, String name);
	public void deleteUser(int id);
}

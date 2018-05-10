package com.maiseenok.user_base.repository;

import java.util.List;

import com.maiseenok.user_base.model.User;

public interface UserRepository {
	public List<User> getAllUsers();
	public void updateUser(int id, String name);
	public void deleteUser(int id);
}

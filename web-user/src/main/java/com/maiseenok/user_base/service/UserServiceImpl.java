package com.maiseenok.user_base.service;

import java.util.List;

import com.maiseenok.user_base.exception.WrongIdException;
import com.maiseenok.user_base.model.User;
import com.maiseenok.user_base.repository.UserRepository;
import com.maiseenok.user_base.repository.UserRepositoryImpl;

public class UserServiceImpl implements UserService{
	private UserRepository userRepository;

	public UserServiceImpl() {
		userRepository= new UserRepositoryImpl();
	}
	@Override
	public void deleteUser(int id) {
		try {
			if(id>0)
				userRepository.deleteUser(id);
			else
				throw new WrongIdException("Negative Id!");
		} 
		catch (WrongIdException e) {
			System.err.print(e.getCause());;
		}
	}

	@Override
	public void updateUser(int id, String name) {
		try {
			if(id>0)
				userRepository.updateUser(id, name);
		else
			throw new WrongIdException("Negative Id!");
		} 
		catch (WrongIdException e) {
			System.err.print(e.getCause());;
		}
	}

	@Override
	public List<User> getAllUsers() {
		List<User> usersList=userRepository.getAllUsers();
		return usersList;
	}
}

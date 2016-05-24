package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UsersDAO;
import com.model.Users;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	
	private UsersDAO usersdao;

	public void addUser(Users users) {
	usersdao.addUser(users);
		
	}

	public Users getUserByName(String name) {
	
		return usersdao.getUserByName(name);
	}

	public List<Users> getAllUsers() {
		return usersdao.getAllUsers();
	
	}
	
	
	
	
	

}

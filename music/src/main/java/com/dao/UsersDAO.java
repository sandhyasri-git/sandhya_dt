package com.dao;

import java.util.List;

import com.model.Users;

public interface UsersDAO {
	
	void addUser(Users users);
	
	Users getUserByName(String userName);
	List<Users>getAllUsers();
	

}

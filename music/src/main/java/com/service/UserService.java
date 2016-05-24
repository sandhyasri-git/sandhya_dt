package com.service;

import java.util.List;

import com.model.Users;

public interface UserService {
	
void addUser(Users users);
Users getUserByName(String name);
List<Users>getAllUsers();

}

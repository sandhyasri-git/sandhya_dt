package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.model.Product;
import com.model.userDetails;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserData ud;

	public void insertUser(userDetails u1) {
		ud.insertUser(u1);
	}

	public List<Product> getData() {
		List<Product> pr = ud.getData();
		return pr;
	}

	public void deleteUser(userDetails u1) {
		ud.deleteUser(u1);
	}

	public void updateUser(userDetails u1) {
		ud.updateUser(u1);
	}
}

package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.model.Product;
import com.model.userDetails;

@Service
@Transactional


public class ProdService {
	
	@Autowired
	private Data d1;
	public void insertUser(userDetails ud)
	{
		d1.insertUser(ud);
	}
	
	public List<Product>getData()
	{
List<Product> prd= d1.getData();
		
		return prd;	
	}
	public void updateUser(userDetails ud)
	{
		d1.updateUser(ud);
	}
	
	public void deleteUser(userDetails ud)
	{
		d1.deleteUser(ud);
	}
}

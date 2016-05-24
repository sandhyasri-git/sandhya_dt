package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Product;
import com.model.userDetails;

@Repository
public class UserData {
	
	private List<Product>prod=new ArrayList<Product>();
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void insertUser(userDetails ud)
	{
		Session ses=sessionFactory.openSession();
		ses.save(ud);
		ses.flush();
	}
	public List<Product>getData()
	{
		Session ses=sessionFactory.getCurrentSession();
		Criteria c1= ses.createCriteria(Product.class);
		List<Product>prod=c1.list();
		return prod;
	}
	
	public void updateUser(userDetails ud)
	{
		Session ses=sessionFactory.getCurrentSession();
		ses.save(ud);
		ses.flush();
	}
	public void deleteUser(userDetails ud)
	{
		Session ses=sessionFactory.getCurrentSession();
		ses.save(ud);
		ses.flush();
	}

}

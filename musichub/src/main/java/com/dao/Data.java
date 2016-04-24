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
public class Data {
	
private List<Product>pr=new ArrayList<Product>();
	@Autowired
private SessionFactory sessionFactory;
public void insertUser(userDetails ud)
{
	Session ses= sessionFactory.openSession();
	ses.save(ud);
	ses.flush();
	
}
	public List<Product>getData()
	{
		Session ses=sessionFactory.getCurrentSession();
		Criteria c=ses.createCriteria(Product.class);
	 pr= c.list();
	return pr;

	}
	public void updateUser(userDetails ui)
	{
		Session ses=sessionFactory.openSession();
		ses.update(ui);
		ses.flush();
	}
	public void deleteUser(userDetails ui)
	{
		Session ses=sessionFactory.getCurrentSession();
		ses.delete(ui);
		ses.flush();
	}

}

package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Product;

@Repository

@Transactional
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	
	private SessionFactory sessionFactory;
	
	public Product getProductById(String id)
	{
		Session ses=sessionFactory.getCurrentSession();
		Product prd=(Product)ses.get(Product.class, id);
		ses.flush();
		return prd;
	}
	public List<Product>getProductList()
	{
		Session ses=sessionFactory.getCurrentSession();
		Query query = ses.createQuery("from Item");
        List<Product> prdList = query.list();
        ses.flush();
        return prdList;

	}
	public void addProduct(Product prd)
	{
		Session ses=sessionFactory.getCurrentSession();
		ses.saveOrUpdate(prd);
		ses.flush();
	}
	public void editProduct(Product prd)
	{
		Session ses=sessionFactory.getCurrentSession();
		ses.saveOrUpdate(prd);
		ses.flush();
	}
	public void deleteProduct(Product prd)
	{
		Session ses=sessionFactory.getCurrentSession();
		ses.delete(prd);
		ses.flush();
	}
	
}


















package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Orders;

@Repository
@Transactional
public class OrdersDAOImpl implements OrdersDAO {

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public void addOrder(Orders orders) {
		
		Session session= sessionFactory.getCurrentSession();
		session.saveOrUpdate(orders);
		session.flush();
		
		
	}

}

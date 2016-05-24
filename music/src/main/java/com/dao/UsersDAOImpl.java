package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.CartInfo;
import com.model.Users;
import com.model.userDetails;

@Repository
@Transactional
public class UsersDAOImpl implements UsersDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	
	public void addUser(Users users) {
	Session session=sessionFactory.getCurrentSession();
	users.getBillAddress().setUsers(users);
	users.getShipAddress().setUsers(users);
	session.saveOrUpdate(users);
	session.saveOrUpdate(users.getBillAddress());
	session.saveOrUpdate(users.getShipAddress());
	userDetails newUserDetails=new userDetails();
	newUserDetails.setName(users.getName());
	newUserDetails.setPassword(users.getPassword());
	CartInfo newCartInfo= new CartInfo();
	newCartInfo.setUsers(users);
	users.setCart(newCartInfo);
	session.saveOrUpdate(users);
	session.save(newCartInfo);
	session.flush();
	}

	
	public Users getUserByName(String userName) {
		Session session=sessionFactory.getCurrentSession();
		Query query= session.createQuery("from Users where username=?");
		query.setString(0, userName);
		return (Users)query.uniqueResult();
		
	}

	
	public List<Users> getAllUsers() {
			
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Users");
		List<Users> list=query.list();
		
		return list; 
	}
	
	

}

package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.CartInfo;
import com.model.CartItems;

@Repository
@Transactional

public class CartItemsDAOImpl implements CartItemsDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	
	public void addCartItem(CartItems cartItems) {
	Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(cartItems);
		session.flush();
	}

	
	public void removeCartItem(CartItems cartItems) {
	
		Session session=sessionFactory.getCurrentSession();
		session.delete(cartItems);
		session.flush();
		
	}

	
	public void removeAllItems(CartInfo cartInfo) {
	List<CartItems>cartList=cartInfo.getCartItems();
		for(CartItems ct:cartList)
		{
			removeCartItem(ct);
		}
	}

	
	public CartItems getCartItemById(int cartItemId) {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from CartItems where cartItemsId=?" );
		query.setInteger(0, cartItemId);
		session.flush();
		return (CartItems)query.uniqueResult();
	}
	
	
}















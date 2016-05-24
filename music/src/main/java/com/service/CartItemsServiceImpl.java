package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CartItemsDAO;
import com.model.CartItems;

@Service
public class CartItemsServiceImpl implements CartItemsService {
	
	@Autowired
	private CartItemsDAO cartItemsdao;
	
	
	public void addCartItem(CartItems cartItems) {
	cartItemsdao.addCartItem(cartItems);
		
	}

	
	public void removeCartItems(CartItems cartItems) {
	cartItemsdao.removeCartItem(cartItems);
		
	}

	public CartItems getCartItemById(int cartId) {
		return cartItemsdao.getCartItemById(cartId);
	}
	
	
	
	
}

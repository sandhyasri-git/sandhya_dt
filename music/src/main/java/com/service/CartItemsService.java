package com.service;

import com.model.CartItems;

public interface CartItemsService {

	void addCartItem(CartItems cartItems);
	void removeCartItems(CartItems cartItems);
	CartItems getCartItemById(int cartId );
	
}

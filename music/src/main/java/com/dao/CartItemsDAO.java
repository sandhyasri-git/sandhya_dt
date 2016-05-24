package com.dao;

import com.model.CartInfo;
import com.model.CartItems;

public interface CartItemsDAO {
	
	void addCartItem(CartItems cartItems);
	void removeCartItem(CartItems cartItems);
	void removeAllItems(CartInfo cartInfo);
	CartItems getCartItemById(int cartItemId);

}

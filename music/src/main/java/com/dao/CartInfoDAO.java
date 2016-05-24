package com.dao;

import java.io.IOException;

import com.model.CartInfo;

public interface CartInfoDAO {
	
	CartInfo getCartById(int cartId);
	
	CartInfo validate(int cartId)throws IOException;
	void update(CartInfo cartInfo);

}

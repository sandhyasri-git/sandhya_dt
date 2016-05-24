package com.service;

import com.model.CartInfo;

public interface CartInfoService {
	
	CartInfo getCartById(int cartId);
	void update(CartInfo cartInfo);
	

}

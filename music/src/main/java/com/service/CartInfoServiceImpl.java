package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CartInfoDAO;
import com.model.CartInfo;

@Service
public class CartInfoServiceImpl implements CartInfoService{
	
	@Autowired
	private CartInfoDAO cartInfodao;

	
	public CartInfo getCartById(int cartId) {
			return cartInfodao.getCartById(cartId);
	}

	
	public void update(CartInfo cartInfo) {
	cartInfodao.update(cartInfo);
		
	}
	
	
	

}

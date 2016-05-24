package com.dao;

import java.io.IOException;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.CartInfo;

@Repository
@Transactional
public class CartInfoDAOImpl implements CartInfoDAO {

	@Override
	public CartInfo getCartById(int cartId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CartInfo validate(int cartId) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(CartInfo cartInfo) {
		// TODO Auto-generated method stub
		
	}
	
	

	
}

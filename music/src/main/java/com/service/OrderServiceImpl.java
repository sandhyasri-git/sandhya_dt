package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.OrdersDAO;
import com.model.CartInfo;
import com.model.CartItems;
import com.model.Orders;

@Service
public class OrderServiceImpl implements OrdersService {
	@Autowired
	private OrdersDAO ordersdao;
	
	@Autowired
	private CartInfoService cartService;

	
	public void addOrder(Orders orders) {
	ordersdao.addOrder(orders);
		
	}

	
	public double getOrderTotal(int cartId) {
		double total=0;
		CartInfo cartInfo =cartService.getCartById(cartId);
		List<CartItems> list=cartInfo.getCartItems();
		for(CartItems items:list)
		{
			total=total+items.getTotalPrice();
		}
		
		
		return total;
	}
	
	

}

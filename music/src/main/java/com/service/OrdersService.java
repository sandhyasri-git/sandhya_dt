package com.service;

import com.model.Orders;

public interface OrdersService {

	void addOrder(Orders orders);
	double getOrderTotal(int cartId);
	
}

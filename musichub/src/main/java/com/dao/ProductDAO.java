package com.dao;

import java.util.ArrayList;

import com.model.Product;

public interface ProductDAO {
		public ArrayList<Product> getProductList();
		public Product getProduct(String Id);
		public int addProduct(String pid,String des,String mid,double price,int qty);
}

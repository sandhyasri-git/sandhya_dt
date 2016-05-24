package com.service;

import java.util.List;

import com.model.Product;

public interface ProductService {
	
	List<Product>getProductList();
	
	Product getProductById(String id);
	void addProduct(Product prd);
	void editProduct(Product pr);
	void deleteProduct(Product pr);
}

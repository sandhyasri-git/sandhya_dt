package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ProductDAO;
import com.model.Product;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	
	private ProductDAO productdao;

	
	public List<Product> getProductList() {
	
		return productdao.getProductList();
	}

	
	public Product getProductById(String id) {
	
		return productdao.getProductById(id);
	}

	
	public void addProduct(Product prd) {
	
		productdao.addProduct(prd);
	}

	
	public void editProduct(Product pr) {
	
		productdao.editProduct(pr);
	}

	
	public void deleteProduct(Product pr) {
	
		productdao.deleteProduct(pr);
	}
	
	
	

}

package com.niit.clothes.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.clothes.config.ApplicationContextConfig;
import com.niit.clothes.dao.CategoryDAO;
import com.niit.clothes.dao.ProductDAO;
import com.niit.clothes.model.Category;
import com.niit.clothes.model.Product;

public class ProductTest {

	static AnnotationConfigApplicationContext context;

	public ProductTest() {
		context = new AnnotationConfigApplicationContext(ApplicationContextConfig.class);
		context.scan("com.niit.clothes");
	}

	/*
	 * public static void createUser(User user) {
	 * 
	 * UserDAO userDAO = (UserDAO) context.getBean("userDAO");
	 * userDAO.saveOrUpdate(user); System.out.println("created"); }
	 */

	public static void main(String[] args) {
		ProductTest t = new ProductTest();
		Product prod = (Product) context.getBean("product");
		prod.setId("P001");
		prod.setDescription("Communication Devices");
		prod.setName("Phone");;
		ProductDAO productDAO = (ProductDAO) context.getBean("productDAO");
		productDAO.saveOrUpdate(prod);
		System.out.println("Inserted");

		// createUser(user);

	}

}

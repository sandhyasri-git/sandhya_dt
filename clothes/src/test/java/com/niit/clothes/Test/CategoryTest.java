package com.niit.clothes.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.clothes.config.ApplicationContextConfig;
import com.niit.clothes.dao.CategoryDAO;
import com.niit.clothes.dao.UserDAO;
import com.niit.clothes.model.Category;
import com.niit.clothes.model.User;

public class CategoryTest {

	static AnnotationConfigApplicationContext context;

	public CategoryTest() {
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
		CategoryTest t = new CategoryTest();

		Category cat = (Category) context.getBean("category");
		cat.setId("C005");
		cat.setName("Mobiles1");
		cat.setDescription("Communication Device");
		CategoryDAO categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
		categoryDAO.saveOrUpdate(cat);
		System.out.println("Inserted");
		// createUser(user);

	}

}

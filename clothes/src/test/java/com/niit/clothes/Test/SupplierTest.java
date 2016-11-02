package com.niit.clothes.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import com.niit.clothes.config.ApplicationContextConfig;
import com.niit.clothes.dao.CategoryDAO;
import com.niit.clothes.dao.SupplierDAO;
import com.niit.clothes.model.Category;
import com.niit.clothes.model.Supplier;

public class SupplierTest {

	static AnnotationConfigApplicationContext context;

	public SupplierTest() {
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
		SupplierTest t = new SupplierTest();

		Supplier supplier = (Supplier) context.getBean("supplier");
		supplier.setId("S001");
		supplier.setName("Laptops");;
		supplier.setAddress("Relaince,Hyderabd");
		SupplierDAO supplierDAO = (SupplierDAO) context.getBean("supplierDAO");
		supplierDAO.saveOrUpdate(supplier);
		System.out.println("Inserted");
		// createUser(user);

	}

}

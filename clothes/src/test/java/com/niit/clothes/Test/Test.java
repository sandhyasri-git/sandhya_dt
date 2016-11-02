package com.niit.clothes.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.clothes.config.ApplicationContextConfig;
import com.niit.clothes.dao.UserDAO;
import com.niit.clothes.model.User;

public class Test {
	
static AnnotationConfigApplicationContext context;
	
	public Test()
	{
		context = new AnnotationConfigApplicationContext(ApplicationContextConfig.class);
		context.scan("com.niit.clothes");
		//context.refresh();
	}
	
	/*public static void createUser(User user)
	{
		
		UserDAO  userDAO =  (UserDAO) context.getBean("userDAO");
		userDAO.saveOrUpdate(user);
		System.out.println("created");
	}*/
		
		

	public static void main(String[] args) {
Test t = new Test();
		
		User user =(User)  context.getBean("user");
		user.setId("S001");
		user.setPassword("raveena");
		user.setAdmin(false);
		UserDAO userDAO =(UserDAO)context.getBean("userDAO");
		userDAO.saveOrUpdate(user);
		System.out.println("Inserted");

		//createUser(user);
		
		}

}

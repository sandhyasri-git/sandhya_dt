package com.niit.clothes.config;

import java.util.Properties;
import java.util.function.Supplier;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.clothes.dao.UserDAO;
import com.niit.clothes.dao.UserDAOImpl;
import com.niit.clothes.model.Category;
import com.niit.clothes.model.Product;
import com.niit.clothes.dao.CategoryDAO;
import com.niit.clothes.dao.CategoryDAOImpl;
import com.niit.clothes.model.User;


@Configuration
@ComponentScan("com.niit.clothes")
@EnableTransactionManagement
public class ApplicationContextConfig {
	

    
    @Bean(name = "dataSource")
    public DataSource getDataSource() {
    	BasicDataSource dataSource = new BasicDataSource();
    	dataSource.setDriverClassName("org.h2.Driver");
    	dataSource.setUrl("jdbc:h2:tcp://localhost/~/test1");
    	dataSource.setUsername("sa");
    	dataSource.setPassword("");
    	
    	return dataSource;
    }
    
    
    private Properties getHibernateProperties() {
    	Properties properties = new Properties();
    	properties.put("hibernate.show_sql", "true");
    	System.out.println("inside application context---Two ");
    	properties.put("hibernate.hbm2ddl.auto","create");
    	properties.put("hibernate.dialect", "org.hibernate.dialect.HSQLDialect");
    	return properties;
    }
    
    @Autowired
    @Bean(name = "sessionFactory")
    public SessionFactory getSessionFactory(DataSource dataSource) {
    	LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
    	sessionBuilder.addProperties(getHibernateProperties());
    	sessionBuilder.addAnnotatedClasses(Category.class);
    	sessionBuilder.addAnnotatedClasses(Supplier.class);
    	sessionBuilder.addAnnotatedClasses(User.class);
    	sessionBuilder.addAnnotatedClasses(Product.class);
    	return sessionBuilder.buildSessionFactory();
    }
    
	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(
			SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(
				sessionFactory);

		return transactionManager;
	}
    
    @Autowired
    @Bean(name = "userDAO")
    public UserDAO getUserDao(SessionFactory sessionFactory) {
    	return new UserDAOImpl(sessionFactory);
    }
    
    /*@Autowired
    @Bean(name = "categoryDAO")
    public CategoryDAO getCategoryDao(SessionFactory sessionFactory) {
    	return new CategoryDAOImpl(sessionFactory);
    }*/

}

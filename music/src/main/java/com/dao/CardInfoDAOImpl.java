package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.CardInfo;

@Repository
@Transactional
public class CardInfoDAOImpl implements CardInfoDAO {

	@Autowired
	private SessionFactory sessionFactory;

	
	public void addCard(CardInfo cardInfo) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(cardInfo);
		session.flush();
				
		
	}
	
	
	
}

package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CardInfoDAO;
import com.model.CardInfo;

@Service
public class CardInfoServiceImpl implements CardInfoService {
	
	@Autowired
	private CardInfoDAO cardInfodao;

		
	public void addCard(CardInfo cardInfo) {
	cardInfodao.addCard(cardInfo);
		
	}
	
	
	

}

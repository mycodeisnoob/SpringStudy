package com.study.hw.service;

import com.study.hw.dao.UserDao;
import com.study.hw.dao.UserDaoImpl;
import com.study.hw.discountPolicy.DiscountPolicy;
import com.study.hw.discountPolicy.FixedDiscountPolicy;
import com.study.hw.dto.Order;
import com.study.hw.dto.User;

public class OrderServiceImpl implements OrderService {

	private UserDao userDao;
	private DiscountPolicy discountPolicy;
	
	public OrderServiceImpl(UserDao userDao, DiscountPolicy discountPolicy) {
		this.discountPolicy = discountPolicy;
		this.userDao = userDao;
	}
	
	@Override
	public Order create(String userId, String itemId, int originalPrice) {
		User user = userDao.searchUserById(userId);
		
		int discountPrice = discountPolicy.discount(user, originalPrice);
		
		Order order = new Order(userId, itemId, originalPrice, discountPrice);
		
		return order;
		
	}

}

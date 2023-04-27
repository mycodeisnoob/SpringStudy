package com.study.hw.config;

import com.study.hw.dao.UserDao;
import com.study.hw.dao.UserDaoImpl;
import com.study.hw.discountPolicy.DiscountPolicy;
import com.study.hw.discountPolicy.FixedDiscountPolicy;
import com.study.hw.discountPolicy.PercentDiscountPolicy;
import com.study.hw.service.OrderService;
import com.study.hw.service.OrderServiceImpl;
import com.study.hw.service.UserService;
import com.study.hw.service.UserServiceImpl;

// 중복된 것 모듈화 시키자

public class AppConfig {
	
	private UserDao userDao() {
		return new UserDaoImpl();
	}
	
	private DiscountPolicy discountPolicy() {
		//return new PercentDiscountPolicy();
		return new FixedDiscountPolicy();
	}
	
	public UserService userService() {
		return new UserServiceImpl(userDao());
	}
	
	public OrderService orderService() {
		return new OrderServiceImpl(userDao(), discountPolicy());
	}

}

package com.study.hw;

import com.study.hw.config.AppConfig;
import com.study.hw.discountPolicy.DiscountPolicy;
import com.study.hw.discountPolicy.PercentDiscountPolicy;
import com.study.hw.dto.Grade;
import com.study.hw.dto.Order;
import com.study.hw.dto.User;
import com.study.hw.service.OrderService;
import com.study.hw.service.UserService;

public class test {
	
	public static void main(String[] args) {
		
		AppConfig appConfig = new AppConfig();
		UserService userService = appConfig.userService();
		OrderService orderService = appConfig.orderService();
		
		User user = new User("vip","vip",Grade.VIP);
		
		userService.regist(user);
		
		Order order = orderService.create(user.getUserId(), "item", 1000);
		
		System.out.println("order = "+order);
	}

}

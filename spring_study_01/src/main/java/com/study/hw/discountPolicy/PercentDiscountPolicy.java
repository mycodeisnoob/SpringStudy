package com.study.hw.discountPolicy;

import com.study.hw.dto.Grade;
import com.study.hw.dto.User;

public class PercentDiscountPolicy implements DiscountPolicy {

	private int vipPercent = 30;
	private int normalPercent = 10;
	
	@Override
	public int discount(User user, int price) {
		if(user.getGrade() == Grade.VIP) {
			return (price * vipPercent)/100;
		}else {
			return (price * normalPercent)/100;
		}
	}

}

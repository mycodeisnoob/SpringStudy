package com.study.hw.discountPolicy;

import com.study.hw.dto.Grade;
import com.study.hw.dto.User;

public class FixedDiscountPolicy implements DiscountPolicy {

	private int vipDiscount = 500;
	private int normalDiscount = 100;
	
	@Override
	public int discount(User user, int price) {
		if(user.getGrade() == Grade.VIP) {
			return vipDiscount;
		}else {
			return normalDiscount;
		}
	}

}

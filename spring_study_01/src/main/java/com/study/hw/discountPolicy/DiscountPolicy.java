package com.study.hw.discountPolicy;

import com.study.hw.dto.User;

public interface DiscountPolicy {
	int discount(User user, int price);
}

package com.study.hw.service;

import com.study.hw.dto.Order;

public interface OrderService {
	Order create(String userId, String itemId, int originalPrice);
}

package com.study.hw.dto;

public class Order {
	
	private String userId;
	private String itemId;
	private int originalPrice;
	private int discountPrice;
	
	public Order(String userId, String itemId, int originalPrice, int discountPrice) {
		this.userId = userId;
		this.itemId = itemId;
		this.originalPrice = originalPrice;
		this.discountPrice = discountPrice;
	}

	
	
	@Override
	public String toString() {
		return "Order [userId=" + userId + ", itemId=" + itemId + ", originalPrice=" + originalPrice
				+ ", discountPrice=" + discountPrice + "]";
	}



	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public int getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(int originalPrice) {
		this.originalPrice = originalPrice;
	}

	public int getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(int discountPrice) {
		this.discountPrice = discountPrice;
	}
	
	
	
}

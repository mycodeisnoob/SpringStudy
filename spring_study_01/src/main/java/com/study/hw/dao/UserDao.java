package com.study.hw.dao;

import com.study.hw.dto.User;

public interface UserDao {
	void insert(User user);
	User searchUserById(String userId);
}

package com.study.hw.dao;

import java.util.HashMap;
import java.util.Map;

import com.study.hw.dto.User;

public class UserDaoImpl implements UserDao {

	private static Map<String, User> saveUserData = new HashMap<>();
	
	@Override
	public void insert(User user) {
		saveUserData.put(user.getUserId(), user);
	}
	
	@Override
	public User searchUserById(String userId) {
		return saveUserData.get(userId);
	}

}

package com.study.hw.service;

import com.study.hw.dao.UserDao;
import com.study.hw.dao.UserDaoImpl;
import com.study.hw.dto.User;

public class UserServiceImpl implements UserService {

	private final UserDao userDao;
	
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public void regist(User user) {
		userDao.insert(user);
	}

	@Override
	public User searchUser(String userId) {
		return userDao.searchUserById(userId);
	}

}

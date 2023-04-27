package com.study.hw.service;

import com.study.hw.dto.User;

public interface UserService {
	void regist(User user);
	User searchUser(String userId);
}

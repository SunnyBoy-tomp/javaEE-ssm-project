package com.service;

import com.model.User;

public interface UserLoginService {
	public User getLoginUser(User user);
	public void registerUser(User user);
}

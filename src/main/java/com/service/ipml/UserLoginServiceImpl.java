package com.service.ipml;

import org.springframework.beans.factory.annotation.Autowired;

import com.Dao.mapper.UserMapper;
import com.model.User;
import com.service.UserLoginService;

public class UserLoginServiceImpl implements UserLoginService{
	@Autowired
	private UserMapper userMapper;
	public User getLoginUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.getLoginUser(user);
	}

	public void registerUser(User user) {
		// TODO Auto-generated method stub
		userMapper.registerUser(user);
		
	}

}

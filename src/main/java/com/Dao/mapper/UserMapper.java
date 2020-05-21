package com.Dao.mapper;

import com.model.User;

public interface UserMapper {
		//查询用户
		public User getLoginUser(User user);
		
		//注册用户
		public void registerUser(User user);

}

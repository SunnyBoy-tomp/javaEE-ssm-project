package com.Dao.mapper;

import com.model.User;

public interface UserMapper {
		//��ѯ�û�
		public User getLoginUser(User user);
		
		//ע���û�
		public void registerUser(User user);

}

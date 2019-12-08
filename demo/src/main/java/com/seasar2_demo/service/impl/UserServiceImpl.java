package com.seasar2_demo.service.impl;

import java.util.List;

import com.seasar2_demo.dao.UserDao;
import com.seasar2_demo.service.UserService;
import com.seasar2_demo.service.entity.User;

public class UserServiceImpl implements UserService{

	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public List<User> list() {
		return this.userDao.list();
	}

}

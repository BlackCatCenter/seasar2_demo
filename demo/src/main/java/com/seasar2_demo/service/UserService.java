package com.seasar2_demo.service;

import java.util.List;

import com.seasar2_demo.service.entity.User;

            
public interface UserService {
	
	/**
	 * 获取用户名称
	 * @param username
	 * @return
	 */
	List<User> list();
}

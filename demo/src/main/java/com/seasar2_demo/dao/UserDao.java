package com.seasar2_demo.dao;

import java.util.List;

import org.seasar.dao.annotation.tiger.S2Dao;
import org.seasar.dao.annotation.tiger.Sql;

import com.seasar2_demo.service.entity.User;


@S2Dao(bean=User.class)
public interface UserDao {
	
	/**
	 * 获取用户名称
	 * @param username
	 * @return
	 */
	@Sql("SELECT * FROM USER ")
	List<User> list();
}

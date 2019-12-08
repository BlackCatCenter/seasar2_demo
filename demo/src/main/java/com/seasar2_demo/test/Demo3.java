package com.seasar2_demo.test;

import java.util.List;

import org.junit.Test;
import org.seasar.dao.unit.S2DaoTestCase;

import com.seasar2_demo.dao.UserDao;
import com.seasar2_demo.service.UserService;
import com.seasar2_demo.service.entity.User;


public class Demo3 extends S2DaoTestCase{
	
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	protected void setUp() throws Exception {
	        super.setUp();
	        include("app.dicon");
    }
	
	@Test
	public void test() {
		List<User> users = userDao.list();
		for(User user:users) {
			System.out.println(user.getUsername());
		}
	}
}

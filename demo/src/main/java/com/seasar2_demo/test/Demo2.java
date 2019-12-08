package com.seasar2_demo.test;

import java.util.List;

import org.junit.Test;
import org.seasar.dao.unit.S2DaoTestCase;

import com.seasar2_demo.service.UserService;
import com.seasar2_demo.service.entity.User;


public class Demo2 extends S2DaoTestCase{
	
	private UserService userService ;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	protected void setUp() throws Exception {
	        super.setUp();
	        include("app.dicon");
    }
	
	@Test
	public void test() {
		
		List<User> users = this.userService.list();
		for(User user:users) {
			System.out.println(user.getNickname()+"  "+user.getPassword());
		}
	}
}

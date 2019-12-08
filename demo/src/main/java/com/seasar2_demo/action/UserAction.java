package com.seasar2_demo.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.seasar.framework.container.S2Container;
import org.seasar.framework.container.factory.S2ContainerFactory;

import com.opensymphony.xwork2.ActionSupport;
import com.seasar2_demo.common.JsonUtils;
import com.seasar2_demo.service.GreetingClientService;
import com.seasar2_demo.service.UserService;
import com.seasar2_demo.service.entity.User;

@WebServlet("/getUserInfo")
 public class UserAction extends HttpServlet{
	private static final long serialVersionUID = 4008184113098539992L;
	/*private UserService userService ;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public  String list() {
		List<User> users = this.userService.list();
		for(User uesr:users) {
			System.out.println(uesr.toString());
		}
		return JsonUtils.objectToJson(users);
	}*/
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
			
	    	S2Container container =  S2ContainerFactory.create("app.dicon");
	    	container.init();       
	    	UserService userService = (UserService)container.getComponent(UserService.class);  
	    	List<User> users = userService.list();
	    	for(User uesr:users) {
				System.out.println(uesr.toString());
			}       
	    	String userInfo = JsonUtils.objectToJson(users);
			PrintWriter out = response.getWriter();  
		    out.write(userInfo);  
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
	
    
	
	
}

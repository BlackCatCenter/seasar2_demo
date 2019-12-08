package com.seasar2_demo.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServletAction")
public class LoginServletAction extends HttpServlet {
	private static final long serialVersionUID = 4008184113098539992L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String username = request.getParameter("username").trim();
		String password = request.getParameter("password").trim();
		if(username.equals("lucy")&&password.equals("123456")) {
			//request.getContextPath()为:/Redirect01
			System.out.println(request.getContextPath());
			//登录成功则重定向到welcome页面
			response.sendRedirect(request.getContextPath()+"/page/user/welcome.jsp");
		}else {
			//登录失败则重定向到login页面
			response.sendRedirect(request.getContextPath()+"/page/user/login.jsp");
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
}

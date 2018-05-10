package com.maiseenok.user_base.servlet;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.maiseenok.user_base.model.User;
import com.maiseenok.user_base.service.UserService;
import com.maiseenok.user_base.service.UserServiceImpl;

public class UserServlet extends HttpServlet{
	private static final long serialVersionUID = 3327945210073636820L;
	
	@Override
	public void init() throws ServletException {
		super.init();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver registered");
		} 
		catch (ClassNotFoundException e) {
			System.out.println("Driver not found");
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType ("text/html; charset=UTF-8");
		
		if(req.getParameter("delete")!=null) 
			deleteRequest(req, resp);
		if(req.getParameter("update")!=null)
			update(req,resp);
		processRequest(req, resp);
	}

	private void update(HttpServletRequest req, HttpServletResponse resp) throws UnsupportedEncodingException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType ("text/html; charset=UTF-8");
		UserService ur= new UserServiceImpl();
		ur.updateUser(Integer.parseInt(req.getParameter("id")),req.getParameter("name"));
	}
	
	private void deleteRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserService ur= new UserServiceImpl();
		ur.deleteUser(Integer.parseInt(req.getParameter("id")));
	}
	
	private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType ("text/html; charset=UTF-8");
		UserService ur= new UserServiceImpl();
		List<User> userList=ur.getAllUsers();
		req.setAttribute("userList", userList);
		RequestDispatcher disp=req.getRequestDispatcher("/user.jsp");
		disp.forward(req,resp);
	}
}

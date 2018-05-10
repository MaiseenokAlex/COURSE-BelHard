package com.maiseenok.user_base.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.maiseenok.user_base.model.User;

@WebServlet("/update")
public class UserUpdateServlet extends HttpServlet{
	private static final long serialVersionUID = 6247583732708893870L;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType ("text/html; charset=UTF-8");

		if(req.getParameter("update")!=null)
			updateRequest(req,resp);
	}
	
	private void updateRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType ("text/html; charset=UTF-8");

		User user=new User(Integer.parseInt(req.getParameter("id")),req.getParameter("name"));
		req.setAttribute("user", user);
		RequestDispatcher disp=req.getRequestDispatcher("/WEB-INF/update.jsp");
		disp.forward(req,resp);
	}

}

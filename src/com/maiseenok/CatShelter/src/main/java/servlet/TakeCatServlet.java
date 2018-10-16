package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.DataGetter;

@WebServlet("/DeleteCat")
public class TakeCatServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		DataGetter.removeCat(Integer.parseInt(req.getParameter("radioId")));
		resp.sendRedirect("/CatShelter/Shelter");
	}
}

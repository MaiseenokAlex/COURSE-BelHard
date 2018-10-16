package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.DataGetter;

@WebServlet("/GetCat")
public class GetCatServlet extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("cat", DataGetter.getCatById(Integer.parseInt(req.getParameter("radioId"))).get(0));
		req.getRequestDispatcher("/WEB-INF/GetCat.jsp").forward(req, resp);
	}
}

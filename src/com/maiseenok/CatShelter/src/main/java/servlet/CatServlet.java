package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.DataGetter;

@WebServlet("/Shelter")
public class CatServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		{
			req.getServletContext().setAttribute("allCats", DataGetter.getAllCats());
			req.getServletContext().setAttribute("catDad", DataGetter.getDadList());
			req.getServletContext().setAttribute("catMom", DataGetter.getMomList());
		}

			req.setAttribute("errorMessage", req.getParameter("errorMessage"));
			req.getRequestDispatcher("/WEB-INF/AllCats.jsp").forward(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if (req.getParameter("action") != null) {
			if (req.getParameter("action").equals("Добавить"))
				addCat(req, resp);

			if (req.getParameter("action").equals("Редактировать"))
				updateCat(req, resp);
				
			if (req.getParameter("action").equals("Просмотреть")) {
				getCat(req, resp);
			}
		}
	}
	
	public void addCat(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendRedirect("/CatShelter/AddCat");
	}

	public void updateCat(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if (req.getParameter("radioId") != null) {
			req.setAttribute("cat",
					DataGetter.getCatById(Integer.parseInt(req.getParameter("radioId"))).get(0));
			req.getRequestDispatcher("/AddCat").forward(req, resp);
		} 
		else {
			req.setAttribute("errorMessage", "Необходимо выбрать кошку.");
			req.getRequestDispatcher("/WEB-INF/AllCats.jsp").forward(req, resp);
		}
	}

	public void getCat(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if (req.getParameter("radioId") != null) {
			req.setAttribute("radioId", req.getParameter("radioId"));
			req.getRequestDispatcher("/GetCat").forward(req, resp);
		} 
		else {
			req.setAttribute("errorMessage", "Необходимо выбрать кошку.");
			req.getRequestDispatcher("/WEB-INF/AllCats.jsp").forward(req, resp);
		}
	}
}

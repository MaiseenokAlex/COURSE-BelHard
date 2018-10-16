package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.DataGetter;

@WebServlet("/AddCat")
public class AddCatServlet extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		if (req.getParameter("radioId") != null && !req.getParameter("radioId").isEmpty()) {
			System.out.println();
			req.setAttribute("cat",
					DataGetter.getCatById(Integer.parseInt(req.getParameter("radioId"))).get(0));
			}
	
		String str;
		boolean check = false;
		
		if(req.getParameter("button") != null)	{
			if(req.getParameter("button").equals("Ок"))
		if ((str = req.getParameter("catName")) != null) {
			if ((str = DataGetter.validate(req.getParameter("catName"), req.getParameter("dadName"), 
							req.getParameter("momName"), req.getParameter("age"), req.getParameter("color"))).isEmpty()) {
				if(req.getParameter("radioId") == null || req.getParameter("radioId").isEmpty())
					DataGetter.addCat(req.getParameter("catName"), req.getParameter("dadName"),
						req.getParameter("momName"), req.getParameter("gender"), req.getParameter("age"),
						req.getParameter("color"));
				else
					DataGetter.mergeCat(req.getParameter("radioId"),req.getParameter("catName"), req.getParameter("dadName"),
								req.getParameter("momName"), req.getParameter("age"),
								req.getParameter("color"));
				check=true;
				req.getRequestDispatcher("/Shelter").forward(req, resp);
			}
			else
				req.setAttribute("errorMessage", str);
		}
			
			if(req.getParameter("button").equals("Отмена")) {
				check=true;
				req.getRequestDispatcher("/Shelter").forward(req, resp);
				}
		}
		
		if(!check)
			req.getRequestDispatcher("/WEB-INF/AddCat.jsp").forward(req, resp);
	}
}

package jaikey.reDirection;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/serch")
public class redirect extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String mysearch=req.getParameter("search");
		
//		resp.sendRedirect("https://www.google.com"); //wec can use this method to redirect internally
		resp.sendRedirect("https://www.google.com/search?q="+mysearch); //it will redirect to search on google
	}

}

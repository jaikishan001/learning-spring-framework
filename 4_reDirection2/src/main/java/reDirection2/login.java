package reDirection2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class login extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		String myemail=req.getParameter("email");
		String pass=req.getParameter("passwd");
		
		if(myemail.equals("directdose2@gmail.com") && pass.equals("direct123")) {
			 //if credentials is correct then it will land to profile page
			//for this we create jsp profile page or html(html is not dynamic page)
			
			req.setAttribute("name_key", "kishan yadav");
			
			RequestDispatcher rd=req.getRequestDispatcher("/profile.jsp");
			rd.forward(req, resp); //redirect forward
		}
		
		else {
			resp.setContentType("text/html"); //html source code ki jagah proper html page show krega
			out.print("<h3 style='color:red'>Email or Password is incorrect<h3>");
			RequestDispatcher rd=req.getRequestDispatcher("login.html"); //if not matched then same page
//			rd.forward(req, resp); //redirect forward only one
			rd.include(req,resp); //it will include both html and redirect
		}
		
		
		
	}

}

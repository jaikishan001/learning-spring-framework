package sessionDemo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class login extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out =resp.getWriter();
		
		String myemail=req.getParameter("email");
		String password=req.getParameter("passwd");
		
		
		
		if(myemail.equals("directdose2@gmail.com") && password.equals("1234")) {
			
//			req.setAttribute("name_key", "kishan");
//			an hum session ke through values ko get karnge 
			
			HttpSession session=req.getSession(); //create a session through this method
			session.setAttribute("name_key", "kishan");
			
			RequestDispatcher rd=req.getRequestDispatcher("/profile.jsp");
			rd.forward(req, resp);
		}
		
		else {
			resp.setContentType("text/html");
			out.print("<h3 style='color:red'>Email or password is incorrect</h3>");
			
			RequestDispatcher rd=req.getRequestDispatcher("login.html");
			rd.include(req, resp);
		}
		
	}

}

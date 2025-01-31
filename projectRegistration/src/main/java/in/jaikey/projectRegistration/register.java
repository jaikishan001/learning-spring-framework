package in.jaikey.projectRegistration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/regform")
public class register extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String myname=req.getParameter("name1");
		String myemail=req.getParameter("email1");
		String mypass=req.getParameter("pass1");
		String mygender=req.getParameter("gender1");
		String mycity=req.getParameter("city1");
		
		PrintWriter out=resp.getWriter();
		
		
		//this entire thing we can put into a method also
		try {
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servdb","root","root@123");
			
			PreparedStatement ps=con.prepareStatement("insert into register values(?,?,?,?,?)");
			ps.setString(1, myname);
			ps.setString(2, myemail);
			ps.setString(3, mygender);
			ps.setString(4, mypass);
			ps.setString(5, mycity);
			
			int count =ps.executeUpdate();
			
			if(count>0) {
				
				resp.setContentType("text/html");
				out.print("<h3 style='color:green'>User registered successfully</h3>");
				
				
				RequestDispatcher rd=req.getRequestDispatcher("/register.jsp");
				rd.include(req, resp);
			
			}
			else {
				
				resp.setContentType("text/html");
				out.print("<h3 style='color:red'>User not registered successfully</h3>");
				
				
				RequestDispatcher rd=req.getRequestDispatcher("/register.jsp");
				rd.include(req, resp);
				
				
			}
		}
		catch(Exception e){
			
			resp.setContentType("text/html");
			e.printStackTrace();
			out.print("<h3 style='color:red'>Exception occured "+e.getMessage()+"</h3>");
			
			
			RequestDispatcher rd=req.getRequestDispatcher("/register.jsp");
			rd.include(req, resp);
			
		}
	}

}

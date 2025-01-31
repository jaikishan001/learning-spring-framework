package in.jaikey.projectRegistration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/loginform")
public class login extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String myemail=req.getParameter("email1");
	String mypass=req.getParameter("pass1");
	
	resp.setContentType("text/html");
	PrintWriter out=resp.getWriter();
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servdb","root","root@123");
		
		PreparedStatement ps=con.prepareStatement("select * from register where email=? and password=?");
		ps.setString(1, myemail);
		ps.setString(2, mypass);
		
//		ResultSet ss= ps.executeQuery();	
		if((ps.executeQuery()).next()) {
			
			out.print("<h3 style='color:green'>successfully login<h3>");
			
			RequestDispatcher rd=req.getRequestDispatcher("/profile.jsp");
			rd.include(req, resp);
	
		}else {
			
			
			out.print("<h3 style='color:red'>email or password didnt matched<h3>");
			
			
			RequestDispatcher rd=req.getRequestDispatcher("/login.jsp");
			rd.include(req, resp);
		}
		
	}
	
	catch(Exception e){
		
		e.printStackTrace();
		
		out.print("<h3 style='color:red'>error occured"+e.getMessage()+"<h3>");
		
		
		RequestDispatcher rd=req.getRequestDispatcher("/login.jsp");
		rd.include(req, resp);
		
		
		
	}
	
	
	}

}

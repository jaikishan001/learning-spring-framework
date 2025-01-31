package formReqRes;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/submitForm")   //form action url will be here
public class myServe extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("form is submitted, i am in service method");
		
		String myname=req.getParameter("name1");
		String myemail =req.getParameter("email1"); //getting request form client and store in variable
		String passwd=req.getParameter("pass");
		
		System.out.println("name: "+myname);  //print in console
		System.out.println("email: "+myemail);
		System.out.println("password: "+passwd);
		
		PrintWriter out =res.getWriter();
		out.println("name: "+myname);
		out.println("email: "+myemail);
		
		if(myemail.equals("directdose2@gmail.com") && passwd.equals("12345678")) {
			System.out.println("success login"); //print in console
			out.println("success login");  //print on browser
		}
		else {
			System.out.println("login failed"); // print on console
		}

				
	}
	
	
	
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		String myname=req.getParameter("name1");
//		String myemail =req.getParameter("email1"); //getting request form client and store in variable
//		String passwd=req.getParameter("pass");
//		
//		PrintWriter out =resp.getWriter();
//		out.println("name: "+myname);
//		out.println("email: "+myemail);
//		out.println("password: "+passwd);
//	}
	
	
	
//	@Override  //post method will be used when form have method post
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		String myname=req.getParameter("name1");
//		String myemail =req.getParameter("email1"); //getting request form client and store in variable
//		private String passwd=req.getParameter("pass"); //using private keyword password cannot be accessed
//		
//		PrintWriter out =resp.getWriter();
//		
//		out.println("name: "+myname);
//		out.println("email: "+myemail);
//		out.println("password: "+passwd);
//	}

}

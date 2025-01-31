package in.jaikey.projectRegistration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jdbccoon  {
public static void main(String arg[]) throws Exception{
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servdb","root","root@123");
	System.out.println("connection success");
	
	
	PreparedStatement ps=con.prepareStatement("insert into register values ('kishan','kishan@123gmail.com','pass123','male','mumbai')");
	int i=ps.executeUpdate();
	
	if(i>0) {
		System.out.println("successfully inserted");
	}
	
	System.out.println("failed");
	}
}

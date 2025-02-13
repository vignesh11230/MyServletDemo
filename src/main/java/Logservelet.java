

//login,logout,dashboard creation code no:2



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Logservelet")
public class Logservelet extends HttpServlet {

    protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
    	String user=req.getParameter("username");
    	String pass=req.getParameter("password");
    	
    	PrintWriter pw;
    	RequestDispatcher rp=req.getRequestDispatcher("general.html");
    	rp.include(req,res);
	   if(user.equals("vikey") && pass.equals("1228"))
	   {
           HttpSession	hsp=req.getSession();
           hsp.setAttribute("un", user);
          
          
//           RequestDispatcher rd=req.getRequestDispatcher("Dashboard.html");
//           rd.forward(req, res);
           pw=res.getWriter();
           pw.println("login successfully");
	   }
	   else {
		   RequestDispatcher rd=req.getRequestDispatcher("login.html");{
			   rd.forward(req, res);
		   }
	   }
   }
 }
       
   

	

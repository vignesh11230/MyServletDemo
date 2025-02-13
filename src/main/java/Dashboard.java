

//login,logout,dashboard creation code no:2


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.Catch;

/**
 * Servlet implementation class Dashboard
 */
@WebServlet("/Dashboard")
public class Dashboard extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	PrintWriter pw=res.getWriter();
	RequestDispatcher rp=req.getRequestDispatcher("general.html");
    rp.include(req,res);
     HttpSession hs=req.getSession(false);
     if(hs!=null) {
     String name=(String)hs.getAttribute("un");
     pw.print("Welcome"+name);
	}
    else {
    	 pw.print("oops! you need to login first");
     }
    	  
	}
	}


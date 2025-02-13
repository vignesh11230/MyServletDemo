



//creation code:8



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class jspser
 */
@WebServlet("/jspser")
public class jspser extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) {
	      int id=Integer.parseInt(req.getParameter("pid"));
	      String str=("select pid from hospital");
	      Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","amosvignesh11230VA@");
    	  PreparedStatement ps=cn.prepareStatement(str);
    	  ps.setInt(1,id);
	      if(id==)
	      try {
	    	  if(pid==)
	      }
	      string str=("select pname,loc from hospital where pname=? and loc=?");
	      Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","amosvignesh11230VA@");
    	  PreparedStatement ps=cn.prepareStatement(str);
    	  ResultSet rs=ps.executeQuery();
    	  
	      PrintWriter pw;
	      try {
	    	  
	    	 
	      }
	      
	}
 

}

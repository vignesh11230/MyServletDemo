//login,logout,dashboard creation code no:2

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class logoutservlet
 */
@WebServlet("/logoutservlet")
public class logoutservlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		RequestDispatcher rp=req.getRequestDispatcher("general.html");
    	rp.include(req,res);
		// TODO Auto-generated method stub
		HttpSession hs=req.getSession();
		hs.getAttribute("un");
		hs.invalidate();
		pw.println("logged out successfully....");
	}

	
}

package test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Findlcookie
 */
public class Findlcookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
	  protected void service
	    (HttpServletRequest request, 
	    		HttpServletResponse response) throws ServletException, IOException {
		     HttpSession session=request.getSession();
		     String pwd=(String)session.getAttribute("password");
		     System.out.println(pwd);
		  }
	    	
	 }


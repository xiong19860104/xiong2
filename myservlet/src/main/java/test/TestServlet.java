package test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TestServlet
 */
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @Override
    protected void service
    (HttpServletRequest request, 
    		HttpServletResponse response) throws ServletException, IOException {
    	//Cookie cookie=new Cookie("name", "xiongxiong");
    	//response.addCookie(cookie);
    	 HttpSession session=request.getSession();
		    session.setAttribute("password", "123456");
    }
}

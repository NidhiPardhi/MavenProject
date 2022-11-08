package in.co.rays.ctl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/cookie"})
public class CookieCtl extends HttpServlet {

		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	    resp.setContentType("text/html");
	    PrintWriter pw= resp.getWriter();
		
		String name= req.getParameter("login");
		String value= req.getParameter("pass");
		
		
		Cookie c= new Cookie(name,value);
		c.setMaxAge(24*60*60);
		resp.addCookie(c);
		
		Cookie[]ck= req.getCookies();
		
		for(Cookie c1 : ck) {
			
			String name1 = c1.getName();
			String value1= c1.getValue();
			
			pw.println(name1+"="+value1);	
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
	}
	
	
	
	
	

}

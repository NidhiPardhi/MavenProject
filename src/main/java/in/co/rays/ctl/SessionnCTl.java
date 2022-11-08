package in.co.rays.ctl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(urlPatterns = {"/sess"} )

public class SessionnCTl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session= req.getSession();
		session.invalidate();
		PrintWriter out = resp.getWriter();
		out.println("log outttt");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session= req.getSession(true);
		String login = req.getParameter("login");
		
		session.setAttribute("user",login);
		
		RequestDispatcher rd= req.getRequestDispatcher("Nidhi.jsp");
		rd.include(req, resp);
		
	}

}

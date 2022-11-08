package in.co.rays.ctl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/visit")
public class VisitCount extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ServletContext ctx = getServletContext();

		Integer count = (Integer) ctx.getAttribute("VisitCount");

		if (count == null) {

			count = 1;
		} else {
			
			count++;
		}

		ctx.setAttribute("VisitCount", count);

		PrintWriter out = resp.getWriter();
		out.println("<html><body>");
		out.println("<h1><u>Visitor Count :" + count + "</u1><h1>");
		out.println("</body></html>");
		//out.println("VC = "+count);
        
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

}

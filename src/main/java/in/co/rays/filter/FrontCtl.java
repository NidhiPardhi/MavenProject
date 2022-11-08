package in.co.rays.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(filterName = "FrontController", urlPatterns = { "*.do" })
public class FrontCtl implements Filter {

	public void destroy() {
		
	}

	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;

		HttpSession session = request.getSession();

		if (request.getAttribute("user") == null) {

			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			request.setAttribute("error", "Session has been Expired......!!!! , Plz login ");
			rd.forward(request, response);
		} else {

			chain.doFilter(req, resp);
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}

package in.co.rays.ctl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

@WebServlet(urlPatterns = { "/session" })

public class SessionCtl extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String login = request.getParameter("login");
		String pass = request.getParameter("pass");
		String js = request.getParameter("jsessionid");

		HttpSession session = request.getSession();

		UserModel model = new UserModel();

		if (login.equals("") && pass.equals("")) {

			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");

			request.setAttribute("err1", "Required Login...!!");
			request.setAttribute("err2", "Required Pass...!!");
			rd.forward(request, response);

		} else {

			try {

				UserBean bean = model.authenticate(login, pass);

				if (bean != null) {

					RequestDispatcher rd = request.getRequestDispatcher("Welcome");

					session.setAttribute("user", bean);

					rd.forward(request, response);

				} else {

					response.sendRedirect("UserRegistration.jsp");

				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
}

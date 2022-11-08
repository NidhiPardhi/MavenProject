package in.co.rays.ctl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.UserBean;
import in.co.rays.dataValid.DataValidation;
import in.co.rays.model.UserModel;

@WebServlet(urlPatterns = { "/login" })

public class LoginCtl extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String login = req.getParameter("login");
		String pass = req.getParameter("pass");
		//String js = req.getParameter("jsessionid");

		/*
		 * DataValidation d = new DataValidation();
		 * 
		 * if (d.isNull("login")) {
		 * 
		 * RequestDispatcher rd = req.getRequestDispatcher("Login.jsp");
		 * 
		 * req.setAttribute("err1", "Required Login...!!");
		 * 
		 * rd.forward(req, resp); } if (d.isNull("pass")) {
		 * 
		 * RequestDispatcher rd = req.getRequestDispatcher("Login.jsp");
		 * 
		 * req.setAttribute("pass", "Required Pass...!!");
		 * 
		 * rd.forward(req, resp); }
		 */

		UserModel model = new UserModel();

		if (login.equals("") && pass.equals("")) {

			RequestDispatcher rd = req.getRequestDispatcher("Login.jsp");

			req.setAttribute("err1", "Required Login...!!");
			req.setAttribute("err2", "Required Pass...!!");
			rd.forward(req, resp);

		} else {

			try {
				UserBean bean = model.authenticate(login, pass);

				if (bean != null) {

					System.out.println("if");

					RequestDispatcher rd = req.getRequestDispatcher("WelcomeInto.jsp");

					req.setAttribute("user", bean.getFname());

					rd.forward(req, resp);

				} else {

					System.out.println("else");

					resp.sendRedirect("UserRegistration.jsp");

				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

}

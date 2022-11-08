package in.co.rays.ctl;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

@WebServlet(urlPatterns = { "/reg" })

public class UserRegistrationCtl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		int fname = Integer.parseInt(req.getParameter("fname"));
		String lname = req.getParameter("lname");
		String login = req.getParameter("login");
		String pass = req.getParameter("pass");
		String mob = req.getParameter("mob");
		String dob = req.getParameter("dob");
		System.out.println("dob = " + dob);

		UserBean bean = new UserBean();
		// bean.setFname(fname);
		bean.setLname(lname);
		bean.setLogin(login);
		bean.setPassword(pass);
		bean.setMobNo(mob);
		try {
			bean.setDob(sdf.parse(dob));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		UserModel model = new UserModel();
		try {
			int i = model.add(bean);
			if (i == 1) {
				RequestDispatcher rd = req.getRequestDispatcher("Login.jsp");
				req.setAttribute("msg", "You are registered successfully......Please login");
				rd.forward(req, resp);

			} else {

				resp.sendRedirect("UserRegistration.jsp");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

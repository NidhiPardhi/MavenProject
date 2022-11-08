package in.co.rays.ctl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.StudentBean;
import in.co.rays.model.StudentModel;

@WebServlet(urlPatterns = { "/Stud" })

public class StudentCtl extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String rollNo = req.getParameter("rollNo");
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String session = req.getParameter("session");
		String op = req.getParameter("operation");

		StudentBean bean = new StudentBean();

		StudentModel model = new StudentModel();

		if (op.equals("Modify")) {

			resp.sendRedirect("RollNo.jsp");
		}
		if (op.equals("Add")) {

			bean.setRollNo(rollNo);
			bean.setFname(fname);
			bean.setLname(lname);
			bean.setSession(session);

			try {
				model.add(bean);

				resp.sendRedirect("StudentView.jsp");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (op.equals("Get")) {

			resp.sendRedirect("studentlist");

		}
		if (op.equals("Delete")) {

			resp.sendRedirect("RollNo.jsp");
		}

	}
}

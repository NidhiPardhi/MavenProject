package in.co.rays.ctl;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.StudentBean;
import in.co.rays.model.StudentModel;

@WebServlet("/studentlist")
public class StudentListCtl extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		StudentBean bean = new StudentBean();
		StudentModel model = new StudentModel();

		try {
			List<StudentBean> list = model.search();

			RequestDispatcher rd = req.getRequestDispatcher("StudentList.jsp");
			req.setAttribute("list", list);
			rd.forward(req, resp);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

}

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

@WebServlet("/del")
public class DeleteCtl extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	
		

		
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String rollNo = req.getParameter("rollNo");

		String op = req.getParameter("operation");
		
		StudentBean bean = new StudentBean();

		StudentModel model = new StudentModel();

		if (op.equals("delete")) {
			
            try {
				model.delete(bean);
				
				resp.sendRedirect("StudentView.jsp");
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

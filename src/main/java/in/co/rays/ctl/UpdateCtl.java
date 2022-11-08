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

@WebServlet(urlPatterns = {"/UpdateCtl"})

public class UpdateCtl extends HttpServlet {

	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		StudentModel model= new StudentModel();
		
		String op = req.getParameter("operation");
		
		String rollNo = req.getParameter("rollNo");
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String session = req.getParameter("session"); 
		
		StudentBean bean=null;
		
		if(op.equals("Update")) {
			
			bean= new StudentBean();
			bean.setRollNo("rollNo");
			bean.setFname("fname");
			bean.setLname("lname");
			bean.setSession("session");
			
			try {
				model.update(bean);
				
				System.out.println(bean.getFname());
				
				RequestDispatcher rd = req.getRequestDispatcher("StudentView.jsp");
				req.setAttribute("up", "Data updated sucessfully...");
				rd.forward(req, resp);
				
			} catch (Exception e) {
 
				e.printStackTrace();
			}
			
			
		}
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String rollNo = req.getParameter("rollNo");
	
		
		String op=req.getParameter("operation");
		
		StudentBean bean= new StudentBean();
		
		bean.setRollNo(rollNo);
		
		StudentModel model= new StudentModel();
	
		if(op.equals("modify")) {
			
		try {
			bean= model.getByRollNo(rollNo);
			
			System.out.println(bean.getRollNo());
			
			RequestDispatcher rd= req.getRequestDispatcher("Update.jsp");
			req.setAttribute("data", bean);
			rd.forward(req, resp);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
			
			}
		if(op.equals("delete")) {
			 try {
					model.delete(bean);
					
					RequestDispatcher rd= req.getRequestDispatcher("StudentView.jsp");
					
					rd.forward(req, resp);
					
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			
			//RequestDispatcher rd= req.getRequestDispatcher("del");
			
			//rd.forward(req, resp);
		}
		}
		
	}



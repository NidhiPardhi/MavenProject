package in.co.rays.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import in.co.rays.bean.StudentBean;

public class StudentModel {

	public int nextPk() throws Exception {

		int pk = 0;

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/rays", "root", "root");
		PreparedStatement ps = conn.prepareStatement("select max(id) from user");

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {

			pk = rs.getInt(1);

		}

		ps.close();
		conn.close();
		return pk + 1;

	}

	public void add(StudentBean bean) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/rays", "root", "root");
		PreparedStatement ps = conn.prepareStatement("insert into student values (?,?,?,?)");
		ps.setString(1, bean.getRollNo());
		ps.setString(2, bean.getFname());
		ps.setString(3, bean.getLname());
		ps.setString(4, bean.getSession());

		int i = ps.executeUpdate();

		ps.close();
		conn.close();
	}

	public int update(StudentBean bean) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/rays", "root", "root");
		PreparedStatement ps = conn.prepareStatement("update student set fname=? ,lname=? ,session=? where rollNo=?");

		ps.setString(1, bean.getFname());
		ps.setString(2, bean.getLname());
		ps.setString(3, bean.getSession());
		ps.setString(4, bean.getRollNo());

		int i = ps.executeUpdate();
		ps.close();
		conn.close();
		return i;
	}

	public void delete(StudentBean bean) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/rays", "root", "root");
		PreparedStatement ps = conn.prepareStatement("delete from student where rollNo = ?");
		ps.setString(1, bean.getRollNo());

		int i = ps.executeUpdate();
		ps.close();
		conn.close();

	}

	public ArrayList<StudentBean> search() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/rays", "root", "root");
		PreparedStatement ps = conn.prepareStatement("select * from student");
		ResultSet rs = ps.executeQuery();

		ArrayList<StudentBean> list = new ArrayList<StudentBean>();

		while (rs.next()) {
			StudentBean bean = new StudentBean();

			bean.setRollNo(rs.getString(1));
			bean.setFname(rs.getString(2));
			bean.setLname(rs.getString(3));
			bean.setSession(rs.getString(4));
			list.add(bean);

		}
		ps.close();
		conn.close();
		return list;

	}

	public StudentBean getByRollNo(String rollNo) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/rays", "root", "root");
		PreparedStatement ps = conn.prepareStatement("select * from student where rollNo=?");
		ps.setString(1, rollNo);

		ResultSet rs = ps.executeQuery();

		StudentBean bean = null;
		while (rs.next()) {
			bean = new StudentBean();
			bean.setRollNo(rs.getString(1));
			bean.setFname(rs.getString(2));
			bean.setLname(rs.getString(3));
			bean.setSession(rs.getString(4));

		}
		ps.close();
		conn.close();
		return bean;

	}

}

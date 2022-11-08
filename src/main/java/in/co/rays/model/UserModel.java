package in.co.rays.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.co.rays.bean.UserBean;

public class UserModel {

	public Integer nextPk() throws Exception {

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

	public Integer add(UserBean bean) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/rays", "root", "root");

		PreparedStatement ps = conn.prepareStatement("insert into user values(?, ?, ?, ?, ?, ?, ?)");

		ps.setInt(1, nextPk());
		ps.setString(2, bean.getFname());
		ps.setString(3, bean.getLname());
		ps.setString(4, bean.getLogin());
		ps.setString(5, bean.getPassword());
		ps.setString(6, bean.getMobNo());
		ps.setDate(7, new java.sql.Date(bean.getDob().getTime()));

		int i = ps.executeUpdate();

		ps.close();
		conn.close();
		return i;

	}

	public UserBean authenticate(String login, String password) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/rays", "root", "root");
		PreparedStatement ps = conn.prepareStatement("select * from user where login = ? and password = ?");
		ps.setString(1, login);
		ps.setString(2, password);

		ResultSet rs = ps.executeQuery();

		UserBean bean = null;

		while (rs.next()) {

			bean = new UserBean();

			bean.setId(rs.getInt(1));
			bean.setFname(rs.getString(2));
			bean.setLname(rs.getString(3));
			bean.setLogin(rs.getString(4));
			bean.setPassword(rs.getString(5));
			bean.setMobNo(rs.getString(6));
			bean.setDob(rs.getDate(7));

		}

		ps.close();
		conn.close();
		return bean;

	}

	public List<UserBean> list() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/rays", "root", "root");
		PreparedStatement ps = conn.prepareStatement("select * from user");

		ResultSet rs = ps.executeQuery();

		ArrayList<UserBean> list = new ArrayList<UserBean>();

		UserBean bean = null;

		while (rs.next()) {

			bean = new UserBean();

			bean.setId(rs.getInt(1));
			bean.setFname(rs.getString(2));
			bean.setLname(rs.getString(3));
			bean.setLogin(rs.getString(4));
			bean.setPassword(rs.getString(5));
			bean.setMobNo(rs.getString(6));
			bean.setDob(rs.getDate(7));
			list.add(bean);

		}

		ps.close();
		conn.close();
		return list;

	}

}

package in.co.rays.bean;

import java.util.Date;

public class UserBean {

	private int id;
	private String fname;
	private String lname;
	private String login;
	private String password;
	private String mobNo;
	private Date dob;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public Date getDob() {
		return dob;
	}

	public void setDob (Date date) {
		this.dob = date;
	}

}

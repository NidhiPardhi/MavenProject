<%@page import="java.util.Iterator"%>
<%@page import="in.co.rays.bean.UserBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		List<UserBean> list = (List<UserBean>) request.getAttribute("list");
		Iterator<UserBean> it = list.iterator();
	%>

	<table>
		<tr>
			<td>Id</td>
			<td>First name</td>
			<td>Last name</td>
			<td>Login</td>
			<td>Password</td>
			<td>Mobile</td>
			<td>Date of Birth</td>
		</tr>
		<%
			while (it.hasNext()) {
				UserBean bean = (UserBean) it.next();
		%>
		<tr>
			<td><%=bean.getId()%></td>
			<td><%=bean.getFname()%></td>
			<td><%=bean.getLname()%></td>
			<td><%=bean.getLogin()%></td>
			<td><%=bean.getPassword()%></td>
			<td><%=bean.getMobNo()%></td>
			<td><%=bean.getDob()%></td>
		</tr>
		<%
			}
		%>
	</table>

</body>
</html>
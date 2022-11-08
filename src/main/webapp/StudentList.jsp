<%@page import="in.co.rays.bean.StudentBean"%>
<%@page import="java.util.Iterator"%>
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
	<center>

		<%
			List<StudentBean> list = (List<StudentBean>) request.getAttribute("list");
			Iterator<StudentBean> it = list.iterator();
		%>
		<h1>Student List</h1>
		<table>
			<tr>
				<th>RollNo</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Session</th>

			</tr>
			<%
				while (it.hasNext()) {
					StudentBean bean = (StudentBean) it.next();
			%>

			<tr>
				<td><%=bean.getRollNo()%></td>
				<td><%=bean.getFname()%></td>
				<td><%=bean.getLname()%></td>
				<td><%=bean.getSession()%></td>
			</tr>

			<%
				}
			%>

		</table>



	</center>

</body>
</html>
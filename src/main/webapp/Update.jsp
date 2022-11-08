<%@ page import="in.co.rays.bean.StudentBean"%>
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
		<form action="UpdateCtl" method="get">
			<h1>Update Student Details...</h1>
			<%
				StudentBean bean = (StudentBean) request.getAttribute("data");
			%>
			<table>
				<tr>
					<th>Roll No. :</th>
					<td><input type="text" name="rollNo"
						value="<%=bean.getRollNo()%>"></td>
				</tr>
				<tr>
					<th>First Name :</th>
					<td><input type="text" name="fname"
						value="<%=bean.getFname()%>"></td>
				</tr>
				<tr>

					<th>Last Name :</th>
					<td><input type="text" name="lname"
						value="<%=bean.getLname()%>"></td>
				</tr>
				<tr>
					<th>Session :</th>
					<td><input type="text" name="session"
						value="<%=bean.getSession()%>"></td>
				</tr>
				<tr>
					<th></th>
					<td><input type="submit" value="Update" name="operation"></td>
				</tr>

			</table>
		</form>
	</center>
</body>
</html>
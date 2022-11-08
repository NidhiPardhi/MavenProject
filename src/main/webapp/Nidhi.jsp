<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="Header.jsp"%>
<table>
 <form action="sess" method="post">
 <h1>Login Form</h1>
    <%
		String s = (String) session.getAttribute("user");
	%>
	<%=s%>
	
				<tr>
					<th>Login :</th>
					<td><input type="text" name="login"></td>
					<td>
					</td>
				</tr>
				<tr>
					<th>Password :</th>
					<td><input type="text" name="pass"></td>
					<td >	

					</td>
				</tr>

				<tr>
					<th></th>
					<td><input type="submit" value="Sign In?"></td>
				</tr>

			</table>

	<%String v= (String)session.getId(); %>
	<%=v %>
</body>
</html>
<%@ page errorPage="ErrorHandler.jsp" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {
	background-color: rgb(255, 100, 0, 0.3);
}

h1 {
	color: red;
	font-size: 50px;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<%@ include file="Header.jsp"%>
		<br> <br> <br> <br> <br> <br>

		<h1>Login Form</h1>
		<form action="session" method="post">

			<%
				String msg = (String) request.getAttribute("msg");
			%>
			<%
				if (msg != null) {
			%><font color="green"><%=msg%></font>
			<%
				}
			%>
			<%--  <%
				String login = (String) request.getAttribute("login");
				String pass = (String) request.getAttribute("pass");
			%> --%>
			<%
				String err1 = (String) request.getAttribute("err1");
				String err2 = (String) request.getAttribute("err2");
			%>
			<%
				String error = (String) request.getAttribute("error");
			%>
			<font color="red"><%=error%></font>

			<table>

				<tr>
					<th>Login :</th>
					<td><input type="text" name="login"></td>
					<td>
						<%
							if (err1 != null) {
						%><font color="red"> <%=err1%></font> <%
 	}
 %> <%-- <%
							if (login != null) {
						%><font color="red"> <%=login%></font> <%
 	}
 %> --%>

					</td>
				</tr>
				<tr>
					<th>Password :</th>
					<td><input type="text" name="pass"></td>
					<td>
						<%
							if (err2 != null) {
						%> <font color="red"><%=err2%></font> <%
 	}
 %> <%-- <%
							if (pass != null) {
						%> <font color="red"><%=err2%></font> <%
 	}
 %> --%>

					</td>
				</tr>
				<tr>
					<td><input type="hidden" name="jsessionid"
						value="<%=session.getId()%>"></td>
				</tr>

				<tr>
					<th></th>
					<td><input type="submit" value="Sign In?"></td>
				</tr>

			</table>

		</form>
	</center>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>

	<%@ include file="Footer.jsp"%>
</body>
</html>
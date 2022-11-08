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
		String user = (String) request.getAttribute("user");
		if (user != null) {
	%>
	Hi,
	<%=user%>
	<a href="Welcome.jsp">Home</a>||
	<a>Contact Us</a>||
	<a>Services</a>||
    <a>Skip to navigate</a>||
	<a>Change Password</a>||
	<a href="Login.jsp">Logout</a>
	<%
		} else {
	%>

	Hi, Guest

	<%
		}
	%>
	<br>
	<br>
	<br>
	<br>

	<hr>
</body>
</html>